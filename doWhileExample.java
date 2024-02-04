import java.util.Scanner;

public class doWhileExample {
    public static void main(String [] args){

        Scanner s = new Scanner(System.in);
        int num;

        do {
            System.out.print("Enter a positive number, negative to exit: ");
            num = s.nextInt();

        }while (num >=0);

        System.out.println("Thank You!");
    }
}
