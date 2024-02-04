import java.util.Scanner;
//כתוב תוכנית הקולטת מהמשתמש מספר עד אשר מוקלד מספר תלת ספרתי
public class doWhileExample1 {
    public static void main(String [] args){

        Scanner s = new Scanner(System.in);
        int num;

        do {
            System.out.print("Enter a number, Three-digit for a exit:  ");
            num = s.nextInt();
        }while (num<100 || num >999);


            System.out.println("Thank you :-)");
    }
}
