// FIXME rename package to com.github.josecxsta.ufg.cs.aula01 (melhor)
package propriedade153;

public class Number {

    public static boolean prop153(int number) {

        final int c = number / 100;
        final int du = number % 100;
        final int d = (du / 10);
        final int u = (du % 10);

        final int c3 = c * c * c;
        final int d3 = d * d * d;
        final int u3 = u * u * u;

        return (c3 + d3 + u3) == number;
    }
}
