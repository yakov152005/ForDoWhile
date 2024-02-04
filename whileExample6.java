import java.util.Scanner;
//קלוט מהמשתמש מספר והצג האם כל ספרותיו זהות
public class whileExample6 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int num;
        boolean allSameDigits = true;

        System.out.print("Please enter a number: ");
        num = s.nextInt();

        while (num >= 10 && allSameDigits) {
            if (num%10 != num/10%10)
                allSameDigits = false;

                num /= 10;
        }
        if (allSameDigits)
            System.out.println("All digits are the same");

        else
            System.out.println("Not all digits are the same");
    }
}
