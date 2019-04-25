package propriedade153;

public class Number {

    public static boolean prop153(int number) {

        int c = (number / 100);
        int du = (number % 100);
        int d = (du / 10);
        int u = (du % 10);

        int c3 = (int)Math.pow(c, 3);
        int d3 = (int)Math.pow(d, 3);
        int u3 = (int)Math.pow(u, 3);

        int x = c3 + d3 + u3;

        return (x == number);
    }
}
