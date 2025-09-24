
class Notes {
	// constants - variables that can't be changed

	// written in all capital letters, use underscore for spaces

	final static int MAXIMUM_VALUE = 15;

	// helps avoid magic - numbers used to make a program run correctly but have no context
	// consistent value across your whole program

	public static void main(String[] args) {

		// compareTo - comparing non-primitive data types

		String word = "Hel";
		String word2 = "Hello";

		System.out.println(word.compareTo(word2) > 0);
		// negative result - earlier alphabetically (ASCII value is before)
		// zero - same
		// positive result - later alphabetically (ASCII value is after)

		// switch - way too many if statements

		int num = 3;
		switch (num) {
			case 1:
				System.out.println("case 1");
				break;
			case 2:
				System.out.println("case 2");
				break;
			case 3:
				System.out.println("case 3");
				break;
			case 4:
				System.out.println("case 4");
				break;
			case 5:
				System.out.println("case 5");
				break;
			default: //else statement
				System.out.println("default");
		}

	}
}
