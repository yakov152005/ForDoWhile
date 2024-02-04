import java.util.Scanner;
//מיזוג ספרות של מספרים
public class TirgolWhile2 {
    public static void main (String [] args){

        Scanner s = new Scanner(System.in);
        int num1, num2;
        int newNum=0, location=1;

        System.out.print("Enter a Two number:");
        num1 = s.nextInt();
        num2 = s.nextInt();
        int temp1 = num1;
        int temp2 = num2;

        while (num2>0){
            newNum += (num2%10) * location;
            location *= 10;

            newNum += (num1%10) * location;
            location *= 10;

            num2 /=10;
            num1 /=10;
        }
        System.out.print("The original numbers is: " + temp1 + " and " +  temp2 + " and The new number is: " + newNum);
    }
}
