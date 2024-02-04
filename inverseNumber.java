import java.util.Scanner;
//הופך את המספר נגיד מ321 ל123
public class inverseNumber {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int num;
        int newNum = 0;
        int orNum = 0;

        System.out.println("Enter a Number: ");
        num = s.nextInt();
        orNum = num;

        while (num > 0){
            newNum = newNum * 10;
            newNum = newNum + (num % 10);
            num = num / 10;
        }
        System.out.println("Rev of " + orNum + " is " +  newNum);
        }
    }
