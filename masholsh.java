import java.util.Scanner;

public class masholsh {
    public static void main(String[] args) {

        Scanner s =new Scanner(System.in);
        int base;
        System.out.print("Please enter the base of the triangle:" );
        base = s.nextInt();

        for (int i=1; i<=base; i++){
            for (int j=1; j<=base-i; j++)
                System.out.print(" ");

            for (int j=1 ; j<=i ; j++ )
                System.out.print("*");
                System.out.println();
        }
    }
}
