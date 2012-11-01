class synchronized_threads extends Thread {
	StringBuffer stringBuffer;
	public synchronized_threads(StringBuffer sb) {
		stringBuffer = sb;
	}
	public void run() {
		synchronized(stringBuffer) {
			for(int i=0; i<100; i++) {
				System.out.println(stringBuffer);
			}
			char c = stringBuffer.charAt(0);
			stringBuffer.deleteCharAt(0);
			stringBuffer.insert(0, ++c);
		}
	}

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("A");
		Thread t1 = new synchronized_threads(sb);
		Thread t2 = new synchronized_threads(sb);
		Thread t3 = new synchronized_threads(sb);
		t1.start();
		t2.start();
		t3.start();
	}
}
