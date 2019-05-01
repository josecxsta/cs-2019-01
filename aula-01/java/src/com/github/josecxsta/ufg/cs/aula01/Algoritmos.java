package com.github.josecxsta.ufg.cs.aula01;

public class Algoritmos {
    public static boolean prop3025(int number) {
        int i = (number / 100);
        int j = (number % 100);
        
        int ij = (int) Math.round(i + j);
        
        int x = ij * ij;
        
        return (x == number);
        
    }
    
    public static boolean quadradoPerfeito(int n) {
        
        int i = 1;
        int s = 1;
        
        while(s < n){
            i = i + 2;
            s = s + 1;
        }
        
        return (s == n);
        
    }
    
    public static int raizQuadrada(int x, int y) {
        
        int r = 1;
        
        while(0 <= y){
            r = (r + (x/r))/2;
            y = y - 1;
        }
        
        return r;
        
    }
    
    public static int razaoAurea(int x, int y, int k) {
        
        int c = y;
        int a = x;
        int i = 1;
        
        while(i <= k){
            final int t = c;
            c = c + a;
            a = t;
            i++;
        }
        
        final int response = c/a;
        
        return response;
        
    }
    
    public static int valorPi(int n) {
        
        int i = 1;
        int s = -1;
        int d = -1;
        int p = 0;
        
        while(i <= n){
            d = d + 2;
            s = -1 * s;
            p = p + (4 * s / d);
            i = i + 1;
        }
        
        return p;
        
    }
}
