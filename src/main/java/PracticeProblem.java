public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int sumOfDigits(int n) {

		//Base Case - when it stops
			if(n < 0)
				n*=-1;
			if(n < 10)
				return n;
		//Recursive calls - what we repeat
			return sumOfDigits(n / 10) + n % 10;
		
	}
	public static int factorial(int n) {
		if(n == 0)
			return 1;
		else if(n < 0)
			return 0;
		
		return n * factorial(n-1);
	}

}
