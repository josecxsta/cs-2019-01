var prompt = require('prompt');

prompt.start();

/**
 * Calcula se o numero eh um quadrado perfeito.
 * @param {number} n numero.
 * @returns {boolean} se numero eh ou nao quadrado perfeito.
 * 
 * @throws {RangeError} se numero for menor do que 1.
 */
function quadradoPerfeito(n) {

  if(n < 1) {
    throw new RangeError("Numero deve ser maior ou igual a 1");
  }

  let i = 1;
  let s = 1;

  while(s < n) {
    i = i + 2;
    s = s + 1;
  }

  return (s == n);

}

const askNumber = () => { 

    prompt.get(['x'], (err, result) => {

        let x = parseInt(result.x);
        
        if(1 <= x) {
            console.log(quadradoPerfeito(x));
        } else {
            askNumber();
        }

    });

}

askNumber();