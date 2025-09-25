public class PracticeProblem {
	static final int MAXIMUM = 10;
	public static void main(String args[]) {
	}
	public static int calculate(int num1, int num2, char operator) {
		switch (operator) {
			case '+':
				return (num1+num2);
			case '-':
				return (num1-num2);
			case '*':
				return (num1*num2);
			case '/':
				return (num1/num2);
			case '%':
				return (num1%num2);
			default:
				return (int)(Math.pow(num1,num2));
		}
	}
	public static boolean totalWordsChecker(String input) {
		if (input.length()!=0) {
			int words = 0;
			boolean space = false;
			for (int i = 0;i<input.length();i++) {
				System.out.println(input.charAt(i));
				if ((Character.isAlphabetic(input.charAt(i)) && space == false)) {
					words += 1;
					space = true;
					if (words>MAXIMUM) {
						return false;
					}
				}
				else if (!(Character.isAlphabetic(input.charAt(i))|| (input.charAt(i)=='_' || input.charAt(i) == '\''))) {
					space = false;
			}
			System.out.println(words);
		}
		
	}
	return true;

	}
	public static String minString(String input1, String input2, String input3) {
		input1 = input1.toLowerCase();
		input2 = input2.toLowerCase();
		input3 = input3.toLowerCase();
		int one = input2.compareTo(input1);
		System.out.println(one);
		int two = input3.compareTo(input1);
		System.out.println(two);
		if (one<0 && two<0) {
			if (one > two) {
				return input3;
			} else if (one < two) {
				return input2;
			} else {
				return input2;
			}
		} else if (one<0 && two >=0) {
			return(input2);
		} else if (one>=0 && two <0) {
			return input3;
		} else {
			return input1;
		}
	}

}
