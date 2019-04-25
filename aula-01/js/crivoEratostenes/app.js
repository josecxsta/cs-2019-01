

const crivoEratostenes = (a, n) => {
  let i = 2; 
  let limite = Math.sqrt(n);
  let multiplo;
  
  while(i <= limite){

    if(a[i] == 0){
      multiplo = i + i 
    
      while(multiplo <= n){
        a[multiplo] = 1;
        multiplo++;
      }
      
    }

    i++;
  }  
}



crivoEratostenes([1, 2, 3, 0, 5], 6);