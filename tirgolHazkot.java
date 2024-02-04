import java.util.Scanner;

public class tirgolHazkot {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int num;
        System.out.println("Please Enter a Number: ");
        num =s.nextInt();

        for (int i=1 ; i<=num ; i++ ) {
           System.out.println(i + "-->" + i*i);

        }

    }
}
