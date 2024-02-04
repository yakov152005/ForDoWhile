import java.util.Scanner;
//המרה ממספר עשרוני לבינארי
public class TirgolWhile5 {
    public static void main (String [] args) {

        Scanner s = new Scanner(System.in);
        int binaryNum=0, decimalNum, temp, location=1;


        System.out.println("Enter a decimal number: ");
        decimalNum = s.nextInt();
        temp = decimalNum;

        while (temp > 0){
            binaryNum += temp % 2 *location;
            location *= 10;
            temp /=2;

        }
        System.out.println("The decimal number is: " + decimalNum+ " and the binary num is: " + binaryNum);
    }
}