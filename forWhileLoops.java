import java.util.Scanner;

public class forWhileLoops {
	public static void main(String[] args) {


	}
	public static void printCharLines(int number,char ch){
		for (int i = 0; i < number; i++) {
			for (int j = 0; j < number; j++) {
				System.out.print(ch);
			}
			System.out.println();
		}
	}
	public static void Ex14and15(){
		System.out.println("Enter number for lines: ");
		int number = s.nextInt();
		System.out.println("Enter a char: ");
		char ch = s.next().charAt(0);
		printCharLines(number, ch);
	}
	public static void printCharForEx16(int number){
		for (int i = 0; i < number; i++) {
			for (int j = 0; j < number; j++) {
				System.out.print(i+1);
			}
			System.out.println();
		}
	}
	public static void Ex16(){
		System.out.println("Enter number for lines: ");
		int number = s.nextInt();
		printCharForEx16(number);
	}
	public static void printCharForEx17(int number){
		for (int i = 1; i <= number; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	public static void Ex17(){
		System.out.println("Enter number for lines: ");
		int number = s.nextInt();
		printCharForEx17(number);

	}
	public static boolean itsOddNumber(int number){
		boolean res = false;
		while (!res){
			if(number % 2 == 0){
				System.out.println("Enter Odd number: ");
				number = s.nextInt();
			}else {
				res = true;
			}
		}return res;
	}
	public static void Ex18(){
		System.out.println("Enter number for lines: ");
		int number = s.nextInt();
		if (itsOddNumber(number)){
			printLinesForEx18(number);
		}
	}
	public static void printLinesForEx18(int number){
		for (int i = 0; i < number; i++) {
			for (int j = 0; j <= i ; j++) {
				System.out.print(i  +1);
			}
			System.out.println();
		}
		for (int i = number-1; i > 0; i--) {
			for (int j = i; j > 0; j--) {
				System.out.print(i );
			}
			System.out.println();
		}
	}
	public static void Ex19(){
		System.out.println("Enter number for lines: ");
		int number = s.nextInt();
		if (itsOddNumber(number)) {
			printLinesForEx19(number);
		}
	}
	public static void printLinesForEx19(int number){
		for (int i = 0; i < number; i+=2) {
			for (int j = 0; j <= i ; j++) {
				System.out.print(i  +1);
			}
			System.out.println();
		}
		for (int i = number-2; i > 0; i-=2) {
			for (int j = i; j > 0; j--) {
				System.out.print(i );
			}
			System.out.println();
		}
	}
	public static void Ex20(){
		System.out.println("Enter Width and length: ");
		int width = s.nextInt();
		int length = s.nextInt();
		printLinesForEx20(width, length);
	}
	public static void printLinesForEx20(int width, int length){
		for (int i = 1; i <= width; i++) {
			System.out.print('*');
		}
		System.out.println();

		for (int j = 1; j <= length -2; j++) {
			 System.out.print('*');
			for (int w = 2; w < width; w++) {
				System.out.print(" ");
			}
			System.out.println('*');
		}
		for (int k = 1; k <= width; k++) {
			System.out.print('*');
		}
		System.out.println();
	}
    public static int power (int base ,int power) {
		int sum =base * base;
	    for (int i = 3; i <= power; i++) {
		    sum = base * sum;
	    }
	    return sum;
    }
	public static void Ex21(){
		System.out.print("Enter base: ");
		int base = s.nextInt();
		System.out.print("Enter power: ");
		int power = s.nextInt();
		int result = power(base, power);
		System.out.println("The result of: " + base +"^"+ power+"="+ result);
	}
	public static int assemblyCalculation(int number){
		int result = 1;
		for (int i = 1; i < number; i++) {
			result += result *i;
		}
		return result;
	}
	public static void Ex22(){
		System.out.println("Enter a number for assembly calculation: ");
		int number = s.nextInt();
		int result = assemblyCalculation(number);
		System.out.println("The result for ---> "+ number +"! = " +result  );
	}
	public static int differenceForInvoiceSeries(int num1, int num2, int num3){
		int diff1 = num2 -num1;
		int diff2 = num3 -num2;
		if (diff1 == diff2){
			return diff1;
		}else
			return -1;
	}
	public static void invoiceSeries(int numA, int diff, int amountOrgans){
		int newDiff = diff;
		System.out.print(numA+",");
		for (int i = 1; i < amountOrgans; i++) {
			int result= numA + diff;
			diff+=newDiff;
			System.out.print(result +",");

		}
	}
	public static void Ex23(){
		System.out.print("Enter The first part of the series: ");
		int numA = s.nextInt();
		System.out.print("Enter difference: ");
		int diff = s.nextInt();
		System.out.print("Enter total number of members in the series: ");
		int amountOrgans = s.nextInt();
		invoiceSeries(numA, diff, amountOrgans);
	}

	public static Scanner s = new Scanner(System.in);
}
