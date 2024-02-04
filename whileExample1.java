import java.util.Scanner;
//חישוב סכום ספרותיו של מספר
public class whileExample1 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int num, sum=0;

        System.out.println("Please enter a number: ");
        num = s.nextInt();

        while (num != 0 ){
            sum += num%10;
            num /= 10;
        }

        System.out.println("Sum is " + sum);

    }
}
