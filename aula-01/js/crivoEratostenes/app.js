/**
 * Espero que documente aqui esta função. E também acrescente testes para
 * verificar se parâmetros estão corretos. Adicionalmente, já percebi sua
 * preferência por "const crivo em vez de function crivo(a, n)", contudo,
 * não se pode abrir mão de legibilidade. Arrow function possui seu espaço,
 * valioso, mas não me parece que este aqui seja o caso.
 *
 * @param a
 * @param n
 */
const crivoEratostenes = (a, n) => {
  let i = 2; 
  const limite = Math.sqrt(n);
  while(i <= limite){
    if(a[i] == 0){
      let multiplo = i + i
    
      while(multiplo <= n){
        a[multiplo] = 1;
        multiplo++;
      }
    }

    i++;
  }  
}



crivoEratostenes([1, 2, 3, 0, 5], 6);