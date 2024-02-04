import java.util.Scanner;
//מציאת הספרה הגדולה ביותר
public class TirgolWhile3 {
    public static void main (String [] args){

        Scanner s = new Scanner(System.in);
        int num, currentDigit;
        int maxNum=0;

        System.out.print("Enter a number: ");
        num = s.nextInt();

        while (num>0){
            currentDigit = num%10;
               if (currentDigit > maxNum){
                   maxNum = currentDigit;
            }
            num /=10;
        }
        System.out.println("The max digit is: " + maxNum);
    }
}