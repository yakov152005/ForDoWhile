import java.util.Scanner;
//ציור כתר
public class TirgolWhile7 {
    public static void main(String[] args) {

        Scanner s =new Scanner(System.in);
        int base;
        System.out.print("Please enter the base of the Crown: " );
        base = s.nextInt();

        for (int i=1, spaces = base*2-2; i<=base; i++, spaces-=2) {
            for (int j = 0; j < i; j++)
                System.out.print("*");

            for (int j = 0; j < spaces; j++)
                System.out.print(" ");

            for (int j = 0; j < i; j++)
                System.out.print("*");

            System.out.println();
        }
    }
}
