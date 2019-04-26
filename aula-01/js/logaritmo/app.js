var prompt = require('prompt');

prompt.start();

function logaritmo(n, k) {

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