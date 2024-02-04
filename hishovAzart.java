public class hishovAzart {
    public static void main(String[] args) {

       int number = (int) (Math.random()*100);

        print("all 2 powers till " + number + ":");
        for (int i=1, j=0 ; i<=number ; i *= 2, j++ ) {
            print("2^" + j + "=" + i);
        }


    }
    public static void print(String s) {System.out.println(s);}
}
