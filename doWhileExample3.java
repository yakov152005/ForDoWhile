import java.util.Scanner;
//כתוב תוכנית הקולטת מהמשתמש מספרים עד אשר מוקלד מספר דו ספרתי שספרותיו זהות
public class doWhileExample3 {
    public static void main (String [] args){

        Scanner s = new Scanner(System.in);
        int num;

        do {
            System.out.println("Enter a number: ");
            num = s.nextInt();

        }while (num < 10 || num > 99 || num%10 != num/10);

        System.out.println("Thank You :) ");

    }
}
