const prompt = require('prompt');

prompt.start();

/**
 * Valida CPF.
 *
 * @param {string} d Sequência de caracteres correspondente a um CPF.
 *
 * @returns {boolean} O valor lógico verdadeiro se...
 *
 * @throws {TypeError} Se não é fornecido argumento ou null ou não é string.
 * @throws {RangeError} Se há caractere que não correspondente a um dígito.
 */
function cpf(d) {

    if(d == null || typeof(d) != 'string'){
        throw new TypeError(); 
    }

    if(d.length != 11){
        throw new RangeError();
    }

  // TODO remover chamadas redundantes para parseInt (apenas 1 vez por digito)
  const j = parseInt(d[0]) + (2 * parseInt(d[1])) + (3 * parseInt(d[2])) + (4 * parseInt(d[3])) + (5 * parseInt(d[4])) + (6 * parseInt(d[5])) + (7 * parseInt(d[6])) + (8 * parseInt(d[7])) + (9 * parseInt(d[8]));
  const k = parseInt(d[1]) + (2 * parseInt(d[2])) + (3 * parseInt(d[3])) + (4 * parseInt(d[4])) + (5 * parseInt(d[5])) + (6 * parseInt(d[6])) + (7 * parseInt(d[7])) + (8 * parseInt(d[8])) + (9 * parseInt(d[9]));
  
  const dj = ((j % 11) % 10);
  const dk = ((k % 11) % 10);

  return (dj == d[9] && dk == d[10]);
  
}


const askNumber = () => { 
  
  prompt.get(['n'], (err, result) => {
    
    let n = result.n;
    
    if(n.length == 11) {
      console.log(cpf(n));
    } else {
      askNumber();
    }
    
  });
  
}

askNumber();