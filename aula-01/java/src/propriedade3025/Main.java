package propriedade3025;

import java.util.Scanner;

public class Main {

    public static int scan() {

        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        if(number < 0 || number > 9999) {
            scan();
        }

        scan.close();

        return number;
    }

    public static void main (String[] args) {

        Number n = new Number();

        System.out.println(n.prop3025(scan()));

    }

}
