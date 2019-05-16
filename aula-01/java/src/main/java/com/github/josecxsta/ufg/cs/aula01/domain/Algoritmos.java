package com.github.josecxsta.ufg.cs.aula01.domain;

import java.lang.Math;

public class Algoritmos {
    
    /**
    * Calcula se numero satisfaz a propriedade 153.
    * @param number numero.
    * @return se satisfaz propriedade 153
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
    * @return se satisfaz propriedade 3025
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
    
    /**
    * Calcula se o numero eh um quadrado perfeito.
    * @param n numero
    * @return se numero é quadrado perfeito
    * @throws IllegalArgumentException se n for menor que 1
    */
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
    
    /**
    * Calcula a raiz quadrada de um numero de acordo com a precisão fornecida
    * @param x numero
    * @param y precisão
    * @return raiz quadrada
    */
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
    
    /**
    * Calcula a razão aurea entre dois numeros
    * @param x 1º número
    * @param y 2º número
    * @param k precisão
    * @return razão aurea entre x e y
    * @throws IllegalArgumentException se x for menor que zero, k menor que 1 ou y menor que x.
    */
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
    
    /**
    * Produz uma aproximação do valor de PI baseado no número de iterações fornecido, 
    onde quanto maior o número de iterações, maior a precisão de PI
    * @param n numero de iteracoes
    * @return aproximacao do valor de PI
    * @throws IllegalArgumentException se n for menor que 1
    */
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
    
    /**
    * Converte cada caracteres de um sequência produzindo um vetor de inteiros correspondente.
    * @param sequencia A sequência de caracteres para a qual um vetor de inteiros será criado.
    * @return coleção de inteiros
    */
    public static int[] converteSequenciaEmInteiros(String sequencia) {
        int[] inteiros = new int[sequencia.length()];
        
        for(int i = 0; i < sequencia.length(); i++) {
            inteiros[i] = Character.getNumericValue(sequencia.charAt(i));
        }
        
        return inteiros;
    }
    
    /**
    * Verifica se o CPF fornecido é válido.
    * @param sequencia coleção de números que formam o cpf
    * @throws IllegalArgumentException se argumento tiver quantidade de caracteres diferente de 11
    * @return se CPF é válido.
    */
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
    
    /**
    * Verifica se o CPF fornecido é válido.
    * @param sequencia coleção de números que formam o cpf
    * @throws IllegalArgumentException se argumento tiver quantidade de caracteres diferente de 11
    * @return se CPF é válido.
    */
    public static boolean CPF2(String sequencia) {
        
        int[] d = converteSequenciaEmInteiros(sequencia);
        
        if (d.length != 11) {
            throw new IllegalArgumentException("CPF precisa de 11 caracteres");
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
    
    /**
    * Calcula o fatorial de dado numero
    * @param n numero
    * @return fatorial de n
    * @throws IllegalArgumentException Se o numero informado for menor que 1 
    */
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
    
    /**
    * Calcula o n-esimo numero da sequência de Fibonacci.
    * @param n numero
    * @throws IllegalArgumentException Se numero inserido for menor que zero.
    * @return c n-esimo numero de Fibonacci.
    */
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
    * @return maior divisor comum entre x e y
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
    * @param a 1º numero
    * @param b 2º numero
    * @return maior divisor comum entre a e b
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
    * Calcula se numero é primo.
    * @param n numero
    * @return se numero é primo ou não
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
    
    /**
    * Calcula a soma dos primeiros numeros naturais.
    * @param n quantidade de numeros naturais a serem somados.
    * @return resultado da soma.
    * @throws IllegalArgumentException se numero inserido for menor ou igual a 1
    */
    public static int somaPrimeirosNaturais(int n) {
        
        if (1 > n){
            throw new IllegalArgumentException("argumento nao eh numero inteiro maior que 1");
        }
        
        int i = 2;
        int s = 1;
        
        while (i <= n) {
            s = s + i; 
            i++;
        } 
        
        return s;
        
    }
    
    /**
    * Calcula o resto da divisao entre dois numeros inteiros
    * @param x numerador
    * @param y denominador
    * @return resto da divisao entre os dois numeros
    * @throws IllegalArgumentException se um dos numeros for menor que zero
    */
    public static int restoDivisao(int x, int y) {
        
        if (y < 0 || x < 0) {
            throw new IllegalArgumentException("numeros devem ser maiores que zero");
        }
        
        int s = x;
        
        while (y <= s) {
            s = s -y;
        }
        
        return s;
    }
    
    /**
    * Calcula resultado de polinômio
    * @param n numero
    * @param c array de coeficientes
    * @return polinomio de n
    * @throws IllegalArgumentException se argumento não for positivo.
    */
    public static int polinomio(int n, int[] c) {
        
        final int grau = c.length;
        
        if (n < 0) {
            throw new IllegalArgumentException("argumento deve ser positivo");
        }
        
        int p = c[grau - 1];
        
        int i;
        
        for (i = grau - 2; i >= 0; i--) {
            p = p * n + c[i];
        }
        
        return p;
        
    }
    
    /**
    * Aplica o método conhecido por Crivo de Eratostenes para 
    identificar se um valor é primo.
    * @param a colecao de numeros
    * @param n valor
    * @return se o valor é primo
    * @throws IllegalArgumentException se parametro nao for numero maior que 1.
    */
    public static boolean crivoEratostenes(int[] a, int n) {
        
        if (n < 2) {
            throw new IllegalArgumentException("argumento deve ser um numero maior que 1");
        }
        
        int i = 2; 
        final int limite = (int) Math.sqrt(n);
        
        while (i <= limite) {
            
            if (a[i] == 0) {
                
                int multiplo = i + i;
                
                while (multiplo <= n) {
                    a[multiplo] = 1;
                    multiplo++;
                }
                
            }
            
            i++;
            
        } 
        
        return (a[n] == 1);
        
    }
    
    /**
    * Calcula potencia apenas usando somas.
    * @param x numero
    * @param y numero de iteracoes para calcular a potencia de x
    * @return potencia
    * @throws IllegalArgumentException Se algum dos numeros for menor que zero.
    */
    public static int potenciaSomas(int x, int y) {
        
        if (x < 0 || y < 0) {
            throw new IllegalArgumentException("os parametros nao podem ser menores que zero"); 
        }
        
        int potencia = 1; 
        int i = 1;
        
        while (i <= y) {
            potencia = potencia * x;
            i++;
        }
        
        return potencia;
    }
    
    /**
    * Calcula o produto dos numeros inteiros fornecidos.
    * @param a multiplicando
    * @param b multiplicador
    * @return resultado da multiplicação
    * @throws IllegalArgumentException se algum dos argumentos for menor que 1
    */
    public static int produtoDeInteiros(int a, int b) {
        
        if (a < 1 || b < 1) {
            throw new IllegalArgumentException("argumentos devem ser maiores que 0");
        }
        
        int totalParcelas = a;
        int parcela = b;
        
        if (b < a) {
            totalParcelas = b;
            parcela = a;
        }
        
        int i = 1;
        int s = 0;
        
        while (i <= totalParcelas) {
            s = s + parcela;
            i = i + 1;
        }
        
        return s;
    }
    
    
    /**
    * Valida o dia
    * @param day dia
    * @return se o dia é válido (entre 1 e 31)
    */
    public static boolean dayValidate(int day) {
        return day >= 1 && day <= 31;
    }
    
    /**
    * Valida o mês
    * @param month mês
    * @return se o mês é válido (entre 1 e 12)
    */
    public static boolean monthValidate(int month) {
        return month >= 1 && month <= 12;
    }
    
    /**
    * Valida o ano
    * @param year ano
    * @return se o ano é válido (entre 12 e 1753)
    */
    public static boolean yearValidate(int year) {
        return (year >= 12 && year <= 1753);
    }
    
    /**
    * Calcula o dia da semana de uma determinada data
    * @param d dia
    * @param m mês
    * @param y ano
    * @return numero referente ao dia da semana
    * @throws IllegalArgumentException se data for invalida
    */
    public static int diaDaSemana(int d, int m, int y) {
        
        if (!dayValidate(d) || !monthValidate(m) || !yearValidate(y)) {
            throw new IllegalArgumentException("data inserida eh invalida");
        }
        
        if ( m == 1 || m == 2 ) {
            m = m + 12; 
            y = y - 1; 
        }
        
        int s = (d + (2*m) + (3*(m+1)/5) + y + (y/4) - (y/100) + (y/400));
        
        return (int) Math.floor(s % 7);
        
    }
    
    /**
    * Calcula o logaritmo natural de um número expoente com a precisão fornecida
    * @param n número expoente
    * @param k precisão
    * @return logaritmo natural
    * @throws IllegalArgumentException se n for menor que 1 ou k menor que 2
    */
    public static int logaritmo(int n, int k) {
        
        if (n < 1 || k < 2) {
            throw new IllegalArgumentException("argumentos fora da faixa");
        }
        
        int i = 2;
        int e = 1 + n;
        int numerador = n;
        int denominador = 1;
        
        while (i <= k) {
            numerador = numerador * numerador;
            denominador = denominador * i;
            e = e + (numerador / denominador);
            i = i + 1;
        }
        
        return e;
        
    }
    
}