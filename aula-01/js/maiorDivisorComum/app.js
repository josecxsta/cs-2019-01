var prompt = require('prompt');

prompt.start();

/**
* Maior divisor comum entre dois numeros
*
* @param {number} x
* @param {number} y
*
* @returns {number} 
*
* @throws {TypeError} Se não é fornecido argumento ou null ou não é string.
* @throws {RangeError} Se há caractere que não correspondente a um dígito.
*/
function mdc(x, y) {
  
  if(typeof(x) != 'number' || typeof(y) != 'number'){
    throw new TypeError();
  }
  
  if(y > x || y < 0){
    throw new RangeError(); 
  }
  
  let m;
  
  while(y != 0) {
    m = x % y;
    x = y;
    y = m;
  }
  
  return x;
  
}

const askNumber = () => { 
  
  prompt.get(['x', 'y'], (err, result) => {
    
    let x = parseInt(result.x);
    let y = parseInt(result.y);
    
    if(y <= x && 0 < y) {
      console.log(mdc(x, y));
    } else {
      askNumber();
    }
    
  });
  
}

askNumber();