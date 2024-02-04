import java.util.Scanner;

public class exampleFor4 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int num;

        System.out.println("please enter a number: ");
        num = s.nextInt();

        for (int i = 0; i <= num; i += 3) {
            if (i < 5) {
                System.out.println(i + " ");
            }
            if (i>=10){
                if (i%10 + i/10 <= 5 )
                    System.out.println(i + " ");
            }
        }
    }
}

