import java.util.Scanner;
//משחק הניחושים
public class TirgolWhile8 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int num;
        int numOfGuesses=0;
        int secretNumber = (int)(Math.random()*100) + 1;

        do {
            System.out.print("Please enter your guess: ");
            num = s.nextInt();

            if (num < secretNumber)
                System.out.println("your number is lower");
            else if (num > secretNumber)
                System.out.println("your number is higher ");

            numOfGuesses++;
        } while (num != secretNumber);

        System.out.println("Bingo! your guessed after " + numOfGuesses + " rounds ");
        System.out.println("The drawn number is: " + secretNumber);

        }
    }
