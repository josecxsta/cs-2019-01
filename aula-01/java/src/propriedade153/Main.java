package propriedade153;

import java.util.Scanner;

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

        Number n = new Number();

        int numero = scan();
        boolean satisfied = n.prop153(numero);

        System.out.println(satisfied);

    }

}
