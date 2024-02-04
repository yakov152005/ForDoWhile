import java.util.Scanner;
public class TirgolWhile9 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int base;

        System.out.print("Enter Your Base: ");
        base = s.nextInt();

        for (int l = 0; l < base; l++) {
            for (int n = 0; n < base; n++) {
                for (int j = 0; j < base; j++) {
                    for (int i = 0; i < base; i++) {
                        System.out.print("*");
                    }
                    System.out.print(" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
