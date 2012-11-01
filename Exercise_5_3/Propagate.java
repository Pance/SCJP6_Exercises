public class Propagate {
	public static void main(String[] args) {
		String emptyString = "";
		String aString = "abcdefg";

		try {
			System.out.println("=> " + reverse(aString) );
		} catch (Exception e) { 
			System.out.println("not expecting this Exception.");
		}

		try {
			System.out.println("=> " + reverse(emptyString) );
		} catch (Exception e) {
			System.out.println("caught Exception.");
		} finally {
			System.out.println("in Finally block. end of Main");
		}
	}

	public static String reverse(String s) throws Exception {
		System.out.print("Reversing: " + s);
		if(s.length() < 1) {
			throw new Exception();
		} else {
			String reverseStr ="";
			for(int i=s.length()-1; i>=0; i--) {
				reverseStr+= s.charAt(i);
			}
			return reverseStr;
		}
	}
}
