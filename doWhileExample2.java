import java.util.Scanner;
// תוכנית הבודקת אם המספר גם תלת ספרתי וגם מתחלק ב-7
public class doWhileExample2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int num;

        do {
            System.out.println("Enter a number: ");
            num = s.nextInt();

        }while (num < 100 || num >= 1000 || num%7 != 0 );

        System.out.println("Bye :)");
    }
}
