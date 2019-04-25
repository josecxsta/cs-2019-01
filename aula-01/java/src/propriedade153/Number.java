package propriedade153;

import java.util.Scanner;

public class Number {
    private int number;

    public void Number() {
    }

    public void scan() {

        Scanner scan = new Scanner(System.in);
        this.number = scan.nextInt();

        if(this.number < 0 || this.number > 9999) {
            this.scan();
        }

    }

    public boolean prop153(int number) {

        int c = (number / 100);
        int du = (this.number % 100);
        int d = (du / 10);
        int u = (du % 10);

        int c3 = (int)Math.pow(c, 3);
        int d3 = (int)Math.pow(d, 3);
        int u3 = (int)Math.pow(u, 3);

        int x = c3 + d3 + u3;

        return (x == this.number);

    }
    
}
