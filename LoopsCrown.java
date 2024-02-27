import java.util.Scanner;

public class LoopsCrown {
	public static void main (String[] args){
		System.out.println("Enter a Crown constellation structure:");
		int naturalN = getInput();

		for (int i = 1, spaces = naturalN *2 -2; i <= naturalN; i++, spaces -=2) {
			for (int j = 0; j< i ; j++){
				System.out.print("*");
			}
			for (int j = 0 ; j < spaces  ; j ++) {
				System.out.print(" ");
			}
			for (int j = 0; j< i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public  static int getInput(){
		Scanner s = new Scanner(System.in);
		return s.nextInt();
	}
}
/*
   *          *
   **        **
   ***      ***
   ****    ****
   ************
 */