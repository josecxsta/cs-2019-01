package com.github.josecxsta.ufg.cs.aula01.domain;

/**
* Implementa algoritmos matemáticos.
* @author José da Costa
*/
public final class AlgoritmosUtils {

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
    * Construtor privado para evitar instância de classe utilitária.
    */
    private AlgoritmosUtils() {
    }

    /**
    * Calcula se o numero eh um quadrado perfeito.
    * @param n numero
    * @return se numero é quadrado perfeito
    * @throws IllegalArgumentException se n for menor que 1
    */
    public static boolean quadradoPerfeito(final int numero) {

        final boolean ehMenorQueUm = numero < 1;
        if (ehMenorQueUm) {
            throw new IllegalArgumentException("n deve ser maior que 0");
        }

        int indice = 1;
        int somaIndice = 1;
        while (somaIndice < numero) {
            indice = indice + 2;
            somaIndice = somaIndice + indice;
        }

        return somaIndice == numero;
    }

    /**
    * Calcula a raiz quadrada de um numero de acordo com a precisão fornecida.
    * @param x numero
    * @param y precisão
    * @return raiz quadrada
    */
    public static int raizQuadrada(final int numero, final int precisao) {

        final boolean menorQueUm = numero < 1;

        if (menorQueUm) {
            throw new IllegalArgumentException("numero deve ser maior que 0");
        }

        int retorno = 1;
        int precisaoAjustado = precisao;

        while (0 <= precisaoAjustado) {
            retorno = (retorno + (numero / retorno)) / 2;
            precisaoAjustado = precisaoAjustado - 1;
        }

        return retorno;
    }

    /**
    * Calcula a razão aurea entre dois numeros.
    * @param x 1º número
    * @param y 2º número
    * @param k precisão
    * @return razão aurea entre x e y
    * @throws IllegalArgumentException se x for menor que 0, se k menor que 1
    se y menor que x.
    */
    public static int razaoAurea(final int x, final int y, final int k) {

        final boolean xMenorQueZero = x < 0;
        final boolean xMaiorQueY = x > y;
        final boolean kMenorQueUm = k <= 0;

        if (xMenorQueZero || xMaiorQueY || kMenorQueUm) {
            throw new IllegalArgumentException("argumentos fora da faixa");
        }

        int c = y;
        int a = x;
        int indice = 1;
        while (indice <= k) {
            final int t = c;
            c = c + a;
            a = t;
            indice++;
        }

        return c / a;
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
    public static int fatorial(final int numero) {

        final boolean nMenorQueUm = 1 > numero;

        if (nMenorQueUm) {
            throw new IllegalArgumentException("n deve ser positivo");
        }

        int indice = 2;
        int f = 1;

        while (indice <= numero) {
            f = f * indice;
            indice = indice + 1;
        }

        return f;

    }

    /**
    * Calcula o n-esimo numero da sequência de Fibonacci.
    * @param n numero
    * @throws IllegalArgumentException se n for menor que zero.
    * @return c n-esimo numero de Fibonacci.
    */
    public static int fibonacci(final int numero) {

        if (0 > n) {
            throw new IllegalArgumentException("n deve ser positivo");
        }

        int a = 0;
        int c = 1;

        final boolean ehZeroOuUm = numero == 0 || numero == 1;

        int indice = 2;
        int t;

        while (indice <= numero) {
            t = c;
            c = c + a;
            a = t;
            indice++;
        }

        return ehZeroOuUm ? numero : c;

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

        int indice = 2;
        while (indice < numero) {
            if (numero % indice == 0) {
                return false;
            }

            indice++;
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

        final boolean nMenorQueUm = 1 > n;

        if (nMenorQueUm) {
            throw new IllegalArgumentException("n deve ser maior que 1");
        }

        int indice = 2;
        int s = 1;

        while (indice <= n) {
            s = s + indice;
            indice++;
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


        for (int indice = grau - 2; indice >= 0; indice--) {
            p = p * n + c[indice];
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

        int indice = 2;
        final int limite = (int) Math.sqrt(n);

        while (indice <= limite) {

            if (a[indice] == 0) {

                int multiplo = indice + indice;

                while (multiplo <= n) {
                    a[multiplo] = 1;
                    multiplo++;
                }

            }

            indice++;

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
        int indice = 1;

        while (indice <= y) {
            potencia = potencia * x;
            indice++;
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
    public static int produtoDeInteiros(final int multiplicando, final int multiplicador) {

        if (multiplicando < 1 || multiplicador < 1) {
            final String error = "argumentos devem ser positivos";
            throw new IllegalArgumentException(error);
        }

        int totalParcelas = multiplicando;
        int parcela = multiplicador;

        if (multiplicador < multiplicando) {
            totalParcelas = multiplicador;
            parcela = multiplicando;
        }

        int indice = 1;
        int parcelas = 0;

        while (indice <= totalParcelas) {
            parcelas = parcelas + parcela;
            indice = indice + 1;
        }

        return parcelas;
    }

    /**
    * Calcula o logaritmo natural de um número expoente com a
    precisão fornecida.
    * @param numero número expoente
    * @param precisao precisão
    * @return logaritmo natural
    * @throws IllegalArgumentException se n for menor que 1 ou precisao menor que 2
    */
    public static int logaritmo(final int numero, final int precisao) {

        if (numero < 1 || precisao < 2) {
            throw new IllegalArgumentException("argumentos fora da faixa");
        }

        int indice = 2;
        int result = DIG_1 + numero;
        int numerador = numero;
        int denominador = DIG_1;

        while (indice <= precisao) {
            numerador = numerador * numerador;
            denominador = denominador * indice;
            result = result + (numerador / denominador);
            indice = indice + DIG_1;
        }

        return result;

    }

}
