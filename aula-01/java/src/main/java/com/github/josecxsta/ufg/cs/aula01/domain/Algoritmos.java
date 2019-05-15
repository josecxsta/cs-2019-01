package com.github.josecxsta.ufg.cs.aula01.domain;

import java.lang.Math;

public class Algoritmos {
    
    /**
    * Calcula se numero satisfaz a propriedade 153.
    * @param number numero.
    * @throws IllegalArgumentException se argumento nao for numero inteiro entre 100 e 999.
    */
    public static boolean prop153(int number) {
        
        if (number < 0 || number > 999) {
            throw new IllegalArgumentException("Argumento fora da faixa");
        }
        
        final int c = number / 100;
        final int du = number % 100;
        final int d = (du / 10);
        final int u = (du % 10);
        
        final int c3 = c * c * c;
        final int d3 = d * d * d;
        final int u3 = u * u * u;
        
        return (c3 + d3 + u3) == number;
    }
    
    /**
    * Calcula se numero satisfaz a propriedade 3025.
    * @param number numero.
    * @throws IllegalArgumentException se argumento nao for numero inteiro entre 100 e 9999.
    */
    public static boolean prop3025(int number) {
        
        if (number < 0 || number > 9999) {
            throw new IllegalArgumentException("Argumento fora da faixa");
        }
        
        int i = (number / 100);
        int j = (number % 100);
        
        int ij = (int) Math.round(i + j);
        
        int x = ij * ij;
        
        return (x == number);
        
    }
    
    public static boolean quadradoPerfeito(int n) {
        
        if (n < 1) {
            throw new IllegalArgumentException("Argumento deve ser maior que 0");
        }
        
        int i = 1;
        int s = 1;
        
        while (s < n) {
            i = i + 2;
            s = s + 1;
        }
        
        return (s == n);
        
    }
    
    public static int raizQuadrada(int x, int y) {
        
        if (x < 1) {
            throw new IllegalArgumentException("Primeiro argumento deve ser maior ou igual a 1");
        }
        
        int r = 1;
        
        while (0 <= y) {
            r = (r + (x/r))/2;
            y = y - 1;
        }
        
        return r;
        
    }
    
    public static int razaoAurea(int x, int y, int k) {
        
        if (x < 0 || x > y || k <= 0) {
            throw new IllegalArgumentException("argumentos fora da faixa");
        }
        
        int c = y;
        int a = x;
        int i = 1;
        
        while (i <= k) {
            final int t = c;
            c = c + a;
            a = t;
            i++;
        }
        
        final int response = c/a;
        
        return response;
        
    }
    
    public static int valorPi(int n) {
        
        if (n < 1) {
            throw new IllegalArgumentException("argumento deve ser numero maior ou igual a 1");
        }
        
        int i = 1;
        int s = -1;
        int d = -1;
        int p = 0;
        
        while (i <= n) {
            d = d + 2;
            s = -1 * s;
            p = p + (4 * s / d);
            i = i + 1;
        }
        
        return p;
        
    }
    
    public static int[] converteSequenciaEmInteiros(String sequencia) {
        int[] inteiros = new int[sequencia.length()];
        
        for(int i = 0; i < sequencia.length(); i++) {
            inteiros[i] = Character.getNumericValue(sequencia.charAt(i));
        }
        
        return inteiros;
    }
    
    public static boolean CPF(String sequencia) {
        
        int[] d = converteSequenciaEmInteiros(sequencia);
        
        if (d.length != 11) {
            throw new IllegalArgumentException("CPF precisa ter 11 caracteres");
        }
        
        final int j = d[0] + (2 * d[1]) + (3 * d[2]) + (4 * d[3]) + (5 * d[4]) + (6 * d[5]) + (7 * d[6]) + (8 * d[7]) + (9 * d[8]);
        final int k = d[1] + (2 * d[2]) + (3 * d[3]) + (4 * d[4]) + (5 * d[5]) + (6 * d[6]) + (7 * d[7]) + (8 * d[8]) + (9 * d[9]);
        
        final int dj = ((j % 11) % 10);
        final int dk = ((k % 11) % 10);
        
        return (dj == d[9] && dk == d[10]);
        
    }
    
    public static boolean CPF2(String sequencia) {
        
        int[] d = converteSequenciaEmInteiros(sequencia);
        
        if (d.length != 11) {
            throw new IllegalArgumentException("CPF precisa ter 11 caracteres");
        }
        
        int c = 7;
        int p = d[8];
        int s = d[8];
        
        while (c >= 0) {
            p = p + d[c];
            s = s + p;
            c = c - 1;
        }
        
        final int j = (s % 11) % 10;
        final int k = ((s - p + 9 * d[9]) % 11) % 10;
        
        return (j == d[9] && k == d[10]);
        
    }
    
    public static int fatorial(int n) {
        
        if (1 > n) {
            throw new IllegalArgumentException("Argumento deve ser positivo");
        }
        
        int i = 2; 
        int f = 1; 
        
        while (i <= n) {
            f = f * i; 
            i = i + 1; 
        } 
        
        return f;
        
    }
    
    public static int fibonacci(int n) {
        
        if (1 > n) {
            throw new IllegalArgumentException("Argumento deve ser maior que 1");
        }
        
        int a = 0;
        int c = 1;
        
        if (n == 0 || n == 1) {
            return n;
        }
        
        int i = 2;
        int t;
        
        while (i <= n) {
            t = c;
            c = c + a;
            a = t;
            i++;
        }
        
        return c;
        
    }
    
    /**
    * Calcula maior divisor comum entre dois numeros.
    * @param x 1º numero
    * @param y 2º numero
    * @throws IllegalArgumentException Se y for maior que x ou y menor do que zero.
    */
    public static int maiorDivisorComum(int x, int y) {
        
        if (x < 1 || y > x) {
            throw new IllegalArgumentException("Argumento fora da faixa");
        }
        
        int m;
        
        while (y != 0) {
            m = x % y;
            x = y;
            y = m;
        }
        
        return x;
        
    }
    
    /**
    * Calcula maior divisor comum entre dois numeros.
    * @param x 1º numero
    * @param y 2º numero
    * @throws IllegalArgumentException Se y for maior que x ou y menor do que zero.
    */
    public static int maiorDivisorComum2(int a, int b) {
        
        if (b < 1 || b > a) {
            throw new IllegalArgumentException("Argumento fora da faixa");
        }
        
        while (a != b) {
            
            if (a > b) {
                a = a - b; 
            } else {
                b = b - a;
            } 
            
        } 
        
        return a;
        
    }
    
    /**
    * Calcula se numero eh primo.
    * @param n numero
    * @throws IllegalArgumentException argumento for numero menor ou igual a 1
    */
    public static boolean numeroPrimo(int n) {
        
        if (n < 0) {
            throw new IllegalArgumentException("Argumento deve ser positivo");
        }
        
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
