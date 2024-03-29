import java.util.Date;
public class CheckGC {
	public static void main(String [] args) {
		Runtime rt = Runtime.getRuntime();
		System.out.println("Total JVM memory: " + rt.totalMemory());
		System.out.println("Before Memory = " + rt.freeMemory());
		Date d = null;
		for(int i = 0; i < 10000;i++) {
			d = new Date();
			d = null;
		}
		System.out.println("After Memory = " + rt.freeMemory());
		for(int i = 0; i < 50; i++) {
			rt.gc();
			System.out.println("After GC Memory = " + rt.freeMemory());
		}
	}
}
