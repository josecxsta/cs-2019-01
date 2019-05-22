package com.github.josecxsta.ufg.cs.aula01.domain;

/**
* Implementa algoritmos matemáticos.
* @author José da Costa
*/
public class Algoritmos {

    /**
    * Limite para o argumento do método prop153.
    */
    public static final int LIMIT_PROP153 = 999;

    /**
    * Limite para o argumento do método prop3025.
    */
    public static final int LIMIT_PROP3025 = 9999;

    /**
    * Atributo que representa o número 1 a fim de evitar
    * a utilização de número mágico.
    */
    public static final int DIG_1 = 1;

    /**
    * Atributo que representa o número 2 a fim de evitar
    * a utilização de número mágico.
    */
    public static final int DIG_2 = 2;

    /**
    * Atributo que representa o número 3 a fim de evitar
    * a utilização de número mágico.
    */
    public static final int DIG_3 = 3;

    /**
    * Atributo que representa o número 4 a fim de evitar
    * a utilização de número mágico.
    */
    public static final int DIG_4 = 4;
    /**
    * Atributo que representa o número 5 a fim de evitar
    * a utilização de número mágico.
    */
    public static final int DIG_5 = 5;

    /**
    * Atributo que representa o número 7 a fim de evitar
    * a utilização de número mágico.
    */
    public static final int DIG_7 = 7;

    /**
    * Atributo que representa o número 10 a fim de evitar
    * a utilização de número mágico.
    */
    public static final int DIG_10 = 10;

    /**
    * Atributo que representa o número 100 a fim de evitar
    * a utilização de número mágico.
    */
    public static final int DIG_100 = 100;

    /**
    * Atributo que representa o número 1000 a fim de evitar
    * a utilização de número mágico.
    */
    public static final int DIG_1000 = 1000;

    /**
    * Atributo que representa o número 12 a fim de evitar
    * a utilização de número mágico.
    */
    public static final int DIG_12 = 12;

    /**
    * Atributo que representa o número 400 a fim de evitar
    * a utilização de número mágico.
    */
    public static final int DIG_400 = 400;

    /**
    * Evita a instanciação da clase.
    * @throws UnsupportedOperationException
    */
    protected Algoritmos() {
        throw new UnsupportedOperationException();
    }

    /**
    * Calcula se numero satisfaz a propriedade 153.
    * @param number numero.
    * @return se satisfaz propriedade 153
    * @throws IllegalArgumentException se argumento nao estiver entre 100 e 999.
    */
    public static boolean prop153(final int number) {

        if (number < 0 || number > LIMIT_PROP153) {
            throw new IllegalArgumentException("Argumento fora da faixa");
        }

        final int c = number / DIG_100;
        final int du = number % DIG_100;
        final int d = (du / DIG_10);
        final int u = (du % DIG_10);

        final int c3 = c * c * c;
        final int d3 = d * d * d;
        final int u3 = u * u * u;

        return (c3 + d3 + u3) == number;
    }

    /**
    * Calcula se numero satisfaz a propriedade 3025.
    * @param number numero.
    * @return se satisfaz propriedade 3025
    * @throws IllegalArgumentException se argumento
    nao estiver entre 100 e 9999.
    */
    public static boolean prop3025(final int number) {

        if (number < 0 || number > LIMIT_PROP3025) {
            throw new IllegalArgumentException("Argumento fora da faixa");
        }

        int i = (number / DIG_100);
        int j = (number % DIG_100);

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
    public static boolean quadradoPerfeito(final int n) {

        if (n < 1) {
            throw new IllegalArgumentException("n deve ser maior que 0");
        }

        int i = 1;
        int s = 1;

        while (s < n) {
            i = i + 2;
            s = s + i;
        }

        return (s == n);

    }

    /**
    * Calcula a raiz quadrada de um numero de acordo com a precisão fornecida.
    * @param x numero
    * @param y precisão
    * @return raiz quadrada
    */
    public static int raizQuadrada(final int x, final int y) {

        if (x < 1) {
            throw new IllegalArgumentException("x deve ser maior que 0");
        }

        int r = 1;

        int argY = y;

        while (0 <= argY) {
            r = (r + (x / r)) / 2;
            argY = argY - 1;
        }

        return r;

    }

    /**
    * Calcula a razão aurea entre dois numeros.
    * @param x 1º número
    * @param y 2º número
    * @param k precisão
    * @return razão aurea entre x e y
    * @throws IllegalArgumentException se x for menor que 0,
    se k menor que 1
    se y menor que x.
    */
    public static int razaoAurea(final int x, final int y, final int k) {

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

        final int response = c / a;

        return response;

    }

    /**
    * Produz uma aproximação do valor de PI baseado no número de
    iterações fornecido, onde quanto maior o número de
    iterações, maior a precisão de PI.
    * @param n numero de iteracoes
    * @return aproximacao do valor de PI
    * @throws IllegalArgumentException se n for menor que 1
    */
    public static int valorPi(final int n) {

        if (n < 1) {
            throw new IllegalArgumentException("n deve ser positivo");
        }

        int i = 1;
        int s = -1;
        int d = -1;
        int p = 0;

        while (i <= n) {
            d = d + 2;
            s = -1 * s;
            p = p + (DIG_4 * s / d);
            i = i + 1;
        }

        return p;

    }

    /**
    * Calcula o fatorial de dado numero.
    * @param n numero
    * @return fatorial de n
    * @throws IllegalArgumentException Se n for menor que 1
    */
    public static int fatorial(final int n) {

        if (1 > n) {
            throw new IllegalArgumentException("n deve ser positivo");
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
    * @throws IllegalArgumentException se n for menor que zero.
    * @return c n-esimo numero de Fibonacci.
    */
    public static int fibonacci(final int n) {

        if (0 > n) {
            throw new IllegalArgumentException("n deve ser positivo");
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
    * @throws IllegalArgumentException Se y for maior que x
    ou y menor do que zero.
    */
    public static int maiorDivisorComum(final int x, final int y) {

        if (x < 1 || y > x) {
            throw new IllegalArgumentException("Argumento fora da faixa");
        }

        int m;

        int argX = x;
        int argY = y;

        while (argY != 0) {
            m = argX % argY;
            argX = argY;
            argY = m;
        }

        return argX;

    }

    /**
    * Calcula maior divisor comum entre dois numeros.
    * @param a 1º numero
    * @param b 2º numero
    * @return maior divisor comum entre a e b
    * @throws IllegalArgumentException Se y for maior que x
    ou y menor do que zero.
    */
    public static int maiorDivisorComum2(final int a, final int b) {

        if (b < 1 || b > a) {
            throw new IllegalArgumentException("Argumento fora da faixa");
        }

        int argA = a;
        int argB = b;

        while (argA != argB) {

            if (argA > argB) {
                argA = argA - argB;
            } else {
                argB = argB - argA;
            }

        }

        return argA;

    }

    /**
    * Calcula se numero é primo.
    * @param numero numero
    * @return se numero é primo ou não
    * @throws IllegalArgumentException se n for numero menor ou igual a 1
    */
    public static boolean numeroPrimo(final int numero) {

        if (numero < 0) {
            throw new IllegalArgumentException("Argumento deve ser positivo");
        }

        int i = 2;
        while (i < numero) {
            if (numero % i == 0) {
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
    * @throws IllegalArgumentException se numero n for menor que 2
    */
    public static int somaPrimeirosNaturais(final int n) {

        if (1 > n) {
            throw new IllegalArgumentException("n deve ser maior que 1");
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
    * Calcula o resto da divisao entre dois numeros inteiros.
    * @param x numerador
    * @param y denominador
    * @return resto da divisao entre os dois numeros
    * @throws IllegalArgumentException se x ou y for menor que 0
    */
    public static int restoDivisao(final int x, final int y) {

        if (y < 0 || x < 0) {
            throw new IllegalArgumentException("x e y devem ser maiores que 0");
        }

        int s = x;

        while (y <= s) {
            s = s - y;
        }

        return s;
    }

    /**
    * Calcula resultado de polinômio.
    * @param n numero
    * @param c array de coeficientes
    * @return polinomio de n
    * @throws IllegalArgumentException se argumento não for positivo.
    */
    public static int polinomio(final int n, final int[] c) {

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
    * @throws IllegalArgumentException se n nao for maior que 1.
    */
    public static boolean crivoEratostenes(final int[] a, final int n) {

        if (n < 2) {
            throw new IllegalArgumentException("n deve ser maior que 1");
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

        return a[n] == 1;

    }

    /**
    * Calcula potencia apenas usando somas.
    * @param x numero
    * @param y numero de iteracoes para calcular a potencia de x
    * @return potencia
    * @throws IllegalArgumentException Se algum dos numeros for menor que zero.
    */
    public static int potenciaSomas(final int x, final int y) {

        if (x < 0 || y < 0) {
            throw new IllegalArgumentException("x e y devem ser positivos");
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
    * @throws IllegalArgumentException se a ou b for menor que 1
    */
    public static int produtoDeInteiros(final int a, final int b) {

        if (a < 1 || b < 1) {
            String msg = "a e b devem ser positivos";
            throw new IllegalArgumentException(msg);
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
    * Calcula o logaritmo natural de um número expoente com a
    precisão fornecida.
    * @param n número expoente
    * @param precisao precisão
    * @return logaritmo natural
    * @throws IllegalArgumentException se n for menor que 1 ou precisao menor que 2
    */
    public static int logaritmo(final int n, final int precisao) {

        if (n < 1 || precisao < 2) {
            throw new IllegalArgumentException("argumentos fora da faixa");
        }

        int i = 2;
        int e = DIG_1 + n;
        int numerador = n;
        int denominador = DIG_1;

        while (i <= precisao) {
            numerador = numerador * numerador;
            denominador = denominador * i;
            e = e + (numerador / denominador);
            i = i + DIG_1;
        }

        return e;

    }

}
