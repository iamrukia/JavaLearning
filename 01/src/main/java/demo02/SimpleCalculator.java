package demo02;

public class SimpleCalculator {
    public static void main(String[] args) {
        int a = 0;
        long b = 10;
        double c = 3.3;

        //addition
        long d = a + b;

        //subtract
        int e = (int) (a - b);

        //multiply
        byte f = 1;
        long g = f * b;

        //divide
        double h = b / c;


        //if
        int i = 0;
        if (a + b * c - d > 0) {
            i = 1;
        }

        //for
        int k = 0;
        for (int j = 0; j < 5; j++) {
            k = k + j;
        }
    }
}
