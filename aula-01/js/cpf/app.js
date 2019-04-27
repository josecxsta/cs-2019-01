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
  
  d = convertStringToArray(d);
  
  const j = d[0] + (2 * d[1]) + (3 * d[2]) + (4 * d[3]) + (5 * d[4]) + (6 * d[5]) + (7 * d[6]) + (8 * d[7]) + (9 * d[8]);
  const k = d[1] + (2 * d[2]) + (3 * d[3]) + (4 * d[4]) + (5 * d[5]) + (6 * d[6]) + (7 * d[7]) + (8 * d[8]) + (9 * d[9]);
  
  const dj = ((j % 11) % 10);
  const dk = ((k % 11) % 10);
  
  return (dj == d[9] && dk == d[10]);
  
}

/**
* Converte uma string em um array de numeros
*
* @param {string} n
*
* @returns {array} colecao dos numeros que estavam em string...
*
*/
function convertStringToArray(n) {
  let arrayOfNumbers = [];
  for(i in n){
    arrayOfNumbers.push(parseInt(n[i]));
  }
  return arrayOfNumbers;
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