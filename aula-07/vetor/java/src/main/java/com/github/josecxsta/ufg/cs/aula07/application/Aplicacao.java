package com.github.josecxsta.ufg.cs.aula07.application;

import java.util.Arrays;

import com.github.josecxsta.ufg.cs.aula07.domain.VetorUtils;

/**
 * Implementa o método main da aplicação.
 */
public class Aplicacao {
    public static void main( String[] args ) {

        double[] vet1 = {1, 4, 5};
        System.out.println( VetorUtils.menorTemperatura(vet1) );
    }
}
