package propriedade3025;

import java.util.Scanner;

public class Number {
    private int number;

    public void Number() {
    }

    public void scan() {

        Scanner scan = new Scanner(System.in);
        this.number = scan.nextInt();

        if(this.number < 0 || this.number > 9999){
            this.scan();
        }

    }

    public boolean prop3025() {
        int i = (number / 100);
        int j = (number % 100);

        int ij = (int) Math.round(i + j);

        int x = ij * ij;

        return (x == number);

    }
}
