import java.util.Scanner;
//כתוב תוכנית הקולטת מהמשתמש מספרים עד אשר מוקלד מספר תלת ספרתי שהוא כפולה של 7 למשל 378
public class whileExample5 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int num;
        boolean fContinue = true;


        while (fContinue) {
            System.out.print("Please enter a number: ");
            num = s.nextInt();
            if (num >=100 && num <1000) {
                if (num %7==0) {
                    fContinue = false;
                }
            }
        }
        System.out.print("bye :-) ");
    }
}
