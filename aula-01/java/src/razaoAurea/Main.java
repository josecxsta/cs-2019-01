package razaoAurea;

import com.github.josecxsta.ufg.cs.aula01.Algoritmos;

import java.util.Scanner;

/**
 * Código para interação com o usuário.
 */
public class Main {

    public static int scan() {

        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        if(number < 1) {
            scan();
        }

        scan.close();

        return number;
    }

    public static void main (String[] args) {

        System.out.println(Algoritmos.razaoAurea(scan(), scan(), scan()));
    
    }

}
