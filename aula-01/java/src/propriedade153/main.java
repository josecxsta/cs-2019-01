package propriedade153;

import java.util.Scanner;

public class main {

    public static void main (String[] args) {

        Number n = new Number();

        n.scan();
        boolean satisfied = n.prop153();

        System.out.println(satisfied);

    }

}
