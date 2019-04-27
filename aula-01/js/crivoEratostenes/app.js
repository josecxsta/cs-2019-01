/**
 * Funcao para calcular o Crivo de Eratostenes dado uma começão de numeros e um limite.
 *
 * @param a colecao de numeros
 * @param n limite
 */
function crivoEratostenes(a, n) {
  let i = 2; 
  const limite = Math.sqrt(n);
  
  while(i <= limite) {
    
    if(a[i] == 0) {
      
      let multiplo = i + i
    
      while(multiplo <= n) {
        a[multiplo] = 1;
        multiplo++;
      }

    }

    i++;
  }  
}

crivoEratostenes([1, 2, 3, 0, 5], 6);