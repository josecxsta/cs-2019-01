package com.github.josecxsta.ufg.cs.aula01.algoritmos;

public class MDC2 {
    
    public static int maiorDivisorComum(int a, int b) {
        
      while(a != b) {
        
        if(a > b) {
            a = a - b; 
        } else {
            b = b - a;
        } 

      } 
    
      return a;
        
    }
}
