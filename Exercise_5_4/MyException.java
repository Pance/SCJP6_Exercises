public class MyException {
	public static void main(String[] args) {
		
		for(String arg: args) {
			try {
				checkFood(arg);
			} catch(BadFoodException e) {
				System.out.println("Exception: " + arg + " was a bad food.");
			}
		}
	}

	public static void checkFood(String s) throws BadFoodException {
		String[] badFoods = {"bread", "poison"};
		for(String food: badFoods) {
			if(food.equals(s)) {
				throw new BadFoodException();
			}
		}
		System.out.println("I like to eat " + s);
	}
}

class BadFoodException extends Exception {}
