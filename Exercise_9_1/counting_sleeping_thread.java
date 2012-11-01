class counting_sleeping_thread extends Thread {
	public void run() {
		for(int i=0; i < 100; i++) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) { }

			if(i % 10 == 0) {
				System.out.println("Hello.");
			}
		}
	}

	public static void main(String[] args) {
		Thread t = new counting_sleeping_thread();
		t.start();
	}
}
