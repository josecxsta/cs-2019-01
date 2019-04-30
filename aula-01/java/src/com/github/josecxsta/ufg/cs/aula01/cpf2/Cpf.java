package com.github.josecxsta.ufg.cs.aula01.cpf2;

public class Cpf {
    
    public static boolean validate(int[] d) {
        
        int c = 7;
        int p = d[8];
        int s = d[8];
        
        while(c >= 0) {
            p = p + d[c];
            s = s + p;
            c = c - 1;
        }
        
        final int j = (s % 11) % 10;
        final int k = ((s - p + 9 * d[9]) % 11) % 10;
        
        return (j == d[9] && k == d[10]);
        
    }
}
