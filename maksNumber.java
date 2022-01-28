package iIElse;


public class maksNumber {


    void max(int a, int b, int c) {
        if (a > b && a > c) {

            System.out.println(a + " Max A");
        } else if (b > a && b > c) {
            System.out.println(b + " Max B");
        } else {
            System.out.println(c + " Max C");
        }


    }

    public static void main(String[] args) {
        maksNumber MN = new maksNumber();
        MN.max(7,2 ,4);


    }
}
