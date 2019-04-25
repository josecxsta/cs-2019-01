package propriedade153;

public class Main {

    public static void main (String[] args) {

        Number n = new Number();

        n.scan();
        boolean satisfied = n.prop153(n.number);

        System.out.println(satisfied);

    }

}
