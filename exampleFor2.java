import java.util.Scanner;
public class exampleFor2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int num;

        System.out.println("pleas enter a number: ");
        num = s.nextInt();

        for (int i=num ; i>=0 ; i--) {
            if (i%3 == 0){
                System.out.print(i + " ");
            }
        }


    }
}
