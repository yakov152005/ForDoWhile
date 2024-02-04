import java.util.Scanner;
//לוח הכפל
public class multiplicationTable {
    public static void main (String [] args){

        Scanner s = new Scanner(System.in);
        int num = 0;

        do {
            System.out.println("Choose a Number 5-10: ");
            num = s.nextInt();
        }while (num < 5 || num >10);

        System.out.printf("%5c", '|');
        //%d זה מספר
        //%c זה תו
        for (int i = 1; i<=num; i++ )
        {
            System.out.printf("%4d|", i);
        }
        System.out.println();

        for (int i = 0; i<=num; i++ )
        {
            System.out.print("-----");
        }
        System.out.println();

        for (int i =1; i<=num; i++ ){
            System.out.printf("%4d|", i);
            for (int j =1; j<=num; j++ )
                System.out.printf("%4d|", i * j);

            System.out.println();
        }
    }
}
