import java.util.Scanner;
//מימוש תפריט
public class doWhileExample4 {
    public static void main (String [] args){

        Scanner s = new Scanner(System.in);
        int choice;
        boolean fContinue = true;

        do {
            System.out.println("Choose one of the following options:"+
                    "\n1 - Squared number" +
                    "\n2 - draw line of starts" +
                    "\n0 - Exit");

            System.out.print("\nEnter your choice -- > ");
            choice = s.nextInt();

            switch (choice) {
                case 1: {
                    int num;

                    System.out.print("Enter a number --> ");
                    num = s.nextInt();

                    System.out.printf("%d^2=%d\n", num, num * num);
                    break;
                }
                case 2:{
                    int num2;

                    System.out.print("Enter num of starts --> ");
                    num2 = s.nextInt();

                    for (int i = 0; i<num2; i++)
                        System.out.print("*");
                        System.out.println();
                        break;

                }
                case 0:{
                    fContinue = false;
                    break;
                } default:
                    System.out.println("Invalid option ");
                    break;
            }
            System.out.println();
        }while (fContinue);

        System.out.println("Goodbye! ");
    }
}
