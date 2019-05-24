package com.github.josecxsta.ufg.cs.aula01.domain;

/**
* Implementa algoritmos matemáticos.
* @author José da Costa
*/
public final class AlgoritmosUtils {

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
    * @param num numero
    * @return se numero é quadrado perfeito
    * @throws IllegalArgumentException se n for menor que 1
    */
    public static boolean quadradoPerfeito(final int num) {

        final boolean ehMenorQueUm = num < 1;
        if (ehMenorQueUm) {
            throw new IllegalArgumentException("n deve ser maior que 0");
        }

        int indice = 1;
        int somaIndice = 1;
        while (somaIndice < num) {
            indice = indice + 2;
            somaIndice = somaIndice + indice;
        }

        return somaIndice == num;
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
    * @param num1 1º número
    * @param num2 2º número
    * @param prec precisão
    * @return razão aurea entre x e y
    * @throws IllegalArgumentException se argumentos estiverem fora da faixa.
    */
    public static int razaoAurea(final int num1, final int num2, final int prec) {

        final boolean num1MenorQueZero = num1 < 0;
        final boolean num1MaiorQuenum2 = num1 > num2;
        final boolean precMenorQueUm = prec <= 0;
        if (num1MenorQueZero || num1MaiorQuenum2 || precMenorQueUm) {
            throw new IllegalArgumentException("argumentos fora da faixa");
        }

        int aux1 = num2;
        int aux2 = num1;
        int indice = 1;
        while (indice <= prec) {
            final int aux = aux1;
            aux1 = aux1 + aux2;
            aux2 = aux;
            indice++;
        }

        return aux1 / aux2;
    }

    /**
    * Produz uma aproximação do valor de PI baseado no número de
    iterações fornecido, onde quanto maior o número de
    iterações, maior a precisão de PI.
    * @param numero numero de iteracoes
    * @return aproximacao do valor de PI
    * @throws IllegalArgumentException se n for menor que 1
    */
    public static int valorPi(final int numero) {

        final boolean numeroMenorQueUm = numero < 1;
        if (numeroMenorQueUm) {
            throw new IllegalArgumentException("n deve ser positivo");
        }

        int indice = 1;
        int aux1 = -1;
        int aux2 = -1;
        int valorPi = 0;
        while (indice <= numero) {
            aux2 = aux2 + 2;
            aux1 = -1 * aux1;
            valorPi = valorPi + (DIG_4 * aux1 / aux2);
            indice = indice + 1;
        }

        return valorPi;
    }

    /**
    * Calcula o fatorial de dado numero.
    * @param numero numero
    * @return fatorial de n
    * @throws IllegalArgumentException Se n for menor que 1
    */
    public static int fatorial(final int numero) {

        final boolean nMenorQueUm = 1 > numero;
        if (nMenorQueUm) {
            throw new IllegalArgumentException("n deve ser positivo");
        }

        int indice = 2;
        int fatorial = 1;
        while (indice <= numero) {
            fatorial = fatorial * indice;
            indice = indice + 1;
        }

        return fatorial;
    }

    /**
    * Calcula o n-esimo numero da sequência de Fibonacci.
    * @param numero numero
    * @throws IllegalArgumentException se n for menor que zero.
    * @return c n-esimo numero de Fibonacci.
    */
    public static int fibonacci(final int numero) {

        if (0 > numero) {
            throw new IllegalArgumentException("n deve ser positivo");
        }

        int aux1 = 0;
        int aux2 = 1;
        final boolean ehZeroOuUm = numero == 0 || numero == 1;
        int indice = 2;
        int aux3;
        while (indice <= numero) {
            aux3 = aux2;
            aux2 = aux2 + aux1;
            aux1 = aux3;
            indice++;
        }

        return ehZeroOuUm ? numero : aux2;
    }

    /**
    * Calcula maior divisor comum entre dois numeros.
    * @param num1 1º numero
    * @param num2 2º numero
    * @return maior divisor comum entre x e y
    * @throws IllegalArgumentException Se y for maior que x
    ou y menor do que zero.
    */
    public static int maiorDivisorComum(final int num1, final int num2) {

        if (num1 < 1 || num2 > num1) {
            throw new IllegalArgumentException("Argumento fora da faixa");
        }

        int aux;
        int num1Ajustado = num1;
        int num2Ajustado = num2;
        while (num2Ajustado != 0) {
            aux = num1Ajustado % num2Ajustado;
            num1Ajustado = num2Ajustado;
            num2Ajustado = aux;
        }

        return num1Ajustado;
    }

    /**
    * Calcula maior divisor comum entre dois numeros.
    * @param num1 1º numero
    * @param num2 2º numero
    * @return maior divisor comum entre a e b
    * @throws IllegalArgumentException Se y for maior que x
    ou y menor do que zero.
    */
    public static int maiorDivisorComum2(final int num1, final int num2) {

        if (num2 < 1 || num2 > num1) {
            throw new IllegalArgumentException("argumentos fora da faixa");
        }

        int num1Ajustado = num1;
        int num2Ajustado = num2;
        while (num1Ajustado != num2Ajustado) {

            if (num1Ajustado > num2Ajustado) {
                num1Ajustado = num1Ajustado - num2Ajustado;
            } else {
                num2Ajustado = num2Ajustado - num1Ajustado;
            }

        }

        return num1Ajustado;
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
    public static int somaPrimeirosNaturais(final int num) {

        final boolean nMenorQueUm = 1 > num;

        if (nMenorQueUm) {
            throw new IllegalArgumentException("n deve ser maior que 1");
        }

        int indice = 2;
        int soma = 1;
        while (indice <= num) {
            soma = soma + indice;
            indice++;
        }

        return soma;
    }

    /**
    * Calcula o resto da divisao entre dois numeros inteiros.
    * @param num1 numerador
    * @param num2 denominador
    * @return resto da divisao entre os dois numeros
    * @throws IllegalArgumentException se num1 ou num2 for menor que 0
    */
    public static int restoDivisao(final int num1, final int num2) {

        if (num2 < 0 || num1 < 0) {
            throw new IllegalArgumentException("num1 e num2 devem ser maiores que 0");
        }

        int resto = num1;
        while (num2 <= resto) {
            resto = resto - num2;
        }

        return resto;
    }

    /**
    * Calcula resultado de polinômio.
    * @param numero numero
    * @param coeficientes array de coeficientes
    * @return polinomio de n
    * @throws IllegalArgumentException se argumento não for positivo.
    */
    public static int polinomio(final int numero, final int[] coeficientes) {

        final int grau = coeficientes.length;
        if (numero < 0) {
            throw new IllegalArgumentException("argumento deve ser positivo");
        }

        int polinomio = coeficientes[grau - 1];
        for (int indice = grau - 2; indice >= 0; indice--) {
            polinomio = polinomio * numero + coeficientes[indice];
        }

        return polinomio;
    }

    /**
    * Aplica o método conhecido por Crivo de Eratostenes para
    identificar se um valor é primo.
    * @param numeros colecao de numeros
    * @param valor valor
    * @return se o valor é primo
    * @throws IllegalArgumentException se n nao for maior que 1.
    */
    public static boolean crivoEratostenes(final int[] numeros, final int valor) {

        final boolean valorMenorQue2 = valor < 2;
        if (valorMenorQue2) {
            throw new IllegalArgumentException("n deve ser maior que 1");
        }

        int indice = 2;
        final int limite = (int) Math.sqrt(valor);
        while (indice <= limite) {

            if (numeros[indice] == 0) {
                int multiplo = indice + indice;
                while (multiplo <= valor) {
                    numeros[multiplo] = 1;
                    multiplo++;
                }

            }

            indice++;
        }

        return numeros[valor] == 1;
    }

    /**
    * Calcula potencia apenas usando somas.
    * @param num numero
    * @param iteracoes numero de iteracoes para calcular a potencia de num
    * @return potencia
    * @throws IllegalArgumentException Se algum dos numeros for menor que zero.
    */
    public static int potenciaSomas(final int num, final int iteracoes) {

        if (num < 0 || iteracoes < 0) {
            throw new IllegalArgumentException("argumentos devem ser positivos");
        }

        int potencia = 1;
        int indice = 1;

        while (indice <= iteracoes) {
            potencia = potencia * num;
            indice++;
        }

        return potencia;
    }

    /**
    * Calcula o produto dos numeros inteiros fornecidos.
    * @param multiplicando multiplicando
    * @param multiplicador multiplicador
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
