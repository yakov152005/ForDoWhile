import java.util.Scanner;
//מספרים אי זוגיים בדיקה
public class exampleFor {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int numOfOddNumbers = 0;

        for (int i=1; i<=10; i ++ ){
            System.out.println("Enter a Number: ");
            int num = s.nextInt();

            if (num%2 == 1 ){
                numOfOddNumbers++;
            }
        }
        System.out.println("There were " + numOfOddNumbers + " odd numbers" );
    }
}
