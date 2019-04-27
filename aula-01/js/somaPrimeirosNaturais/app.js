function somaPrimeirosNaturais(n) {

  if(1 > n){
    throw new RangeError();
  }
  
  let i = 2;
  let s = 1;
  
  while(i <= n) {
    s = s + i; 
    i++;
  } 
  
  return s;
  
}