import java.util.Scanner;
// יצירת מספר המכיל רק את הספרות הזוגיות
public class TirgolWhile1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int num, newNum = 0, location = 1;

        System.out.println("Enter a number: ");
        num = s.nextInt();
        int temp = num;

        while (temp > 0) {
            if (temp % 2 == 0) {
                newNum += (temp%10) * location;
                location *= 10;
            }
            temp /= 10; //לקצץ ספרה ימנית
        }
            System.out.println("The even digits in the number: " + num+ " they: " +newNum);

    }
}
