import java.util.Scanner;
//כתוב תוכנית הקולטת מהמשתמש מספרים שלמים עד אשר הוקלדו בדיוק 5 מספרים זוגיים
public class whileExample2 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int num, counter=0;


        while (counter < 5){
            System.out.print("Please enter a number: ");
            num = s.nextInt();
            if (num %2 == 0) {
                counter++;
            }
        }
        System.out.print("Bye :) ");
    }
}
