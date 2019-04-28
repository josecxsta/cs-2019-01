package cpf;

import java.util.Scanner;

/**
 * Código para interação com o usuário.
 */
public class Main {

    public static int[] scan() {

        Scanner scan = new Scanner(System.in);
        String cpf = scan.nextLine();

        int inArray[] = new int[10];
        
        for (int i = 0; i < cpf.length(); i++){
            inArray[i] = (int) cpf.charAt(i);        
        }
        
        scan.close();
        
        return inArray;

    }



    public static void main (String[] args) {

        System.out.println(Cpf.validate(scan()));
    }

}
