package propriedade153;

import java.util.Scanner;

/**
 * Código para interação com o usuário.
 */
public class Main {

    public static int scan() {

        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        if(number < 0 || number > 9999) {
            scan();
        }

        return number;
    }

    public static void main (String[] args) {
        System.out.println(Number.prop153(scan()));
    }

}
