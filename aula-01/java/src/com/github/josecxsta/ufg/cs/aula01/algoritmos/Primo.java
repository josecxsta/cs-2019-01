package com.github.josecxsta.ufg.cs.aula01.algoritmos;

public class Primo {
    
    public static boolean numeroPrimo(int n) {
        
        int i = 2;
        while (i < n) {
            if (n % i == 0) {
                return false;
            }
    
            i++;
        }
    
        return true;
        
    }
}
