var prompt = require('prompt');

prompt.start();

/**
 * Calcula o logaritmo natural de um numero.
 * @param {number} n .
 * @param {number} k.
 * @returns {number} e.
 * 
 * @throws {RangeError} Caso n seja menor que 1 ou k menor que 2.
 */
function logaritmo(n, k) {

    if(n < 1 || k < 2) {
        throw new RangeError();
    }

    let i = 2;
    let e = 1 + n;
    let numerador = n;
    let denominador = 1;

    while (i <= k){
        numerador = numerador * numerador;
        denominador = denominador * i;
        e = e + (numerador / denominador);
        i = i + 1;
    }

    return e;

}

const askNumber = () => { 

    prompt.get(['n', 'k'], (err, result) => {

        let n = result.n;
        let k = result.k;
        
        if(n >= 1 && k >=2) {
            console.log(logaritmo(n, k));
        } else {
            askNumber();
        }

    });

}

askNumber();