var prompt = require('prompt');

prompt.start();

/**
 * Calcula a razao aurea
 * 
 * @param {number} x 
 * @param {number} y 
 * @param {number} k 
 * @returns {number} razao aurea entre x, y e k.
 * 
 * @throws {RangeError}
 */
function razaoAurea(x, y, k) {


    if(x < 0 || x > y || k <= 0) {
        throw new RangeError();
    }

    let c = y;
    let a = x;
    let i = 1;

    while(i <= k){
        t = c;
        c = c + a;
        a = t;
        i++;
    }

    let response = c/a;

    return response;

}

const askNumber = () => { 

    prompt.get(['x', 'y', 'k'], (err, result) => {

        let x = parseInt(result.x);
        let y = parseInt(result.y);
        let k = parseInt(result.k);
        
        if(x >= 0 && x < y && 0 < k) {
            console.log(razaoAurea(x, y, k));
        } else {
            askNumber();
        }

    });

}

askNumber();