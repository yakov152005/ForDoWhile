import java.util.Scanner;
//המרה ממספר בינארי לעשרוני
public class TirgolWhile4 {
    public static void main (String [] args) {

        Scanner s = new Scanner(System.in);
        int binaryNum, decimalNum=0, temp, location=1;


        System.out.println("Enter a binary number : (0-1) ");
        binaryNum = s.nextInt();
        temp = binaryNum;

        while (temp > 0){
            decimalNum += (temp%10) * location;
            location *= 2;
            temp /= 10;
        }
        System.out.println("The binary number is: " + binaryNum + " and the decimal num is: " + decimalNum);
    }
}