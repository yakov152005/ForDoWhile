import java.util.Scanner;

public class Malben {
    public static void main(String[] args) {

        Scanner s =new Scanner(System.in);
        int rows, cols;
        System.out.print("Please enter number of rows and columns:" );
        rows = s.nextInt();
        cols = s.nextInt();

        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
