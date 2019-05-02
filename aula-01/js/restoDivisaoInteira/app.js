var prompt = require('prompt');

prompt.start();

/**
 * Calcula o resto da divisao entre dois numeros.
 * @param {number} x 
 * @param {number} y
 * @returns {number} resto da divisao entre x e y.
 * 
 * @throws {RangeError} se um dos numeros for menor que zero.
 */
function restoDivisao(x, y) {
    
    if(y < 0 || x < 0){
        throw new RangeError('Numeros devem ser maiores que zero.')
    }
    
    let s = x;

    while(y <= s){
        s = s -y;
    }

    return s;
}

const askNumber = () => { 

    prompt.get(['x', 'y'], (err, result) => {

        let x = result.x;
        let y = result.y;
        
        if(0 <= y && 0 < x) {

            console.log(restoDivisao(x, y));

        } else {
            askNumber();
        }

    });

}

askNumber();