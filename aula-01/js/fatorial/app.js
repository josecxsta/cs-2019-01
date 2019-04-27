function fatorial(n){

  if(1 > n){
    throw new RangeError();
  }

  let i = 2; 
  let f = 1; 
  
  while(i <= n) {
    f = f * i; 
    i = i + 1; 
  } 
  
  return f;

}