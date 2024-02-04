import java.util.Scanner;
//בסיס משולש אשר הבסיס שלו מתחיל מלעמלה ומוצמד לימין
public class TirgolWhile6 {
    public static void main(String[] args) {

        Scanner s =new Scanner(System.in);
        int base;
        System.out.print("Please enter the base of the triangle: " );
        base = s.nextInt();

        for (int i=0; i < base ; i++) {
            for (int j=0; j < i ; j++)
                System.out.print(" ");

            for (int j = 0; j < base - i; j++)
                System.out.print("*");

            System.out.println();
        }
    }
}
