package propriedade3025;

public class Number {
    private int number;

    public boolean prop3025(int number) {
        int i = (number / 100);
        int j = (number % 100);

        int ij = (int) Math.round(i + j);

        int x = ij * ij;

        return (x == number);

    }
}
