import java.util.Scanner;
//כתוב תוכנית הקולטת מהמשתמש מספר כל עוד המספר אינו תלת ספרתי התוכנית תבקש מהמשתמש להקליד מספר מחדש
public class whileExample3 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int num;
        boolean fContinue = true;


        while (fContinue) {
            System.out.print("Please enter a number: ");
            num = s.nextInt();
            if (num >= 100 && num < 1000)
                fContinue = false;
        }
        System.out.print("bye :-) ");
    }
}
