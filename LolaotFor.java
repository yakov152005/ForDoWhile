public class LolaotFor {
    public static void main(String[] args) {

        int number =(int) (Math.random()*10);

        print("All numbers from %d to 1:\n" );
        for (int i=number ; i>= 1 ; i--){
            print(i + " ");
        }

    }
    public static void print(String s) {System.out.println(s);}
}
