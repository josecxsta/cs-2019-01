package propriedade3025;

import java.util.Scanner;

public class Number {
    private int number;

    public void Number(){

    }

    public void scan(){

        Scanner scan = new Scanner(System.in);
        this.number = scan.nextInt();

    }

    public boolean prop3025() {
        int i = (number / 100);
        int j = (number % 100);

        int ij = Math.round(i + j);

        int x = Math.pow((int)ij, 2);

        return (x == number);

    }
}
