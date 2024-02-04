import java.util.Scanner;

public class exampleFor3 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int num;

        System.out.println("please enter a number: ");
        num = s.nextInt();

        for (int i=1; i<=num; i++){
            if (i%7 == 0){
                System.out.println( "Boom");
            }else  System.out.println( i );
        }
    }
}