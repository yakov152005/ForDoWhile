import java.util.Scanner;
public class whileExample {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int num, counter=0, sum=0;

        System.out.println("Please enter a number, -1 to stop: ");
        num = s.nextInt();

        while (num != -1){
            sum +=num;
            counter++;
            num = s.nextInt();
        }
        System.out.printf("Average of the %d numbers is %f\n", counter, (float)sum/counter);

    }
}
