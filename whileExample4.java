import java.util.Scanner;
//כתוב תוכנית הקולטת מהמשתמש מספרים עד אשר מוקלד מספר דו ספרתי שספרותיו זהות
public class whileExample4 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int num, sum=0;
        boolean fContinue = true;


        while (fContinue) {
            System.out.print("Please enter a number: ");
            num = s.nextInt();
            if (num >=10 && num <100) {
                sum += num % 10;
                num /= 10;
                if (sum == num)
                    fContinue = false;
            }
        }
        System.out.print("bye :-) ");
    }
}
