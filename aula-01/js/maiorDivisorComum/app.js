var prompt = require('prompt');

prompt.start();

/**
 * Calcula maior divisor comum entre dois numeros.
 *
 * @param {number} x.
 * @param {number} y.
 *
 * @returns {number} x maior divisor comum entre x e y.
 *
 * @throws {TypeError} Se um dos parametros nao for numero.
 * @throws {RangeError} Se b for maior que a ou b menor do que zero.
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