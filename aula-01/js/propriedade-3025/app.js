var prompt = require('prompt');

prompt.start();

/**
 * Calcula se numero satisfaz a propriedade 3025.
 * @param {number} number numero.
 * @returns {boolean} se numero satisfaz a propriedade 3025.
 * 
 * @throws {RangeError} se numero nao estiver entre 0 e 9999.
 */
function prop3025 (number) {

    if(number < 0 || number > 9999) {
        throw new RangeError("Numero deve ser entre 0 e 9999");
    }

    const i = parseInt(number / 100);
    const j = parseInt(number % 100);
    const x = Math.pow((i + j), 2);

    return (x == number);

} 

const askNumber = () => { 
    
    prompt.get(['number'], (err, result) => {
        
        let number = result.number;
        
        if(number >= 0 && number <= 9999) {
            
            let isSatistified = prop3025(number);
            console.log(isSatistified);
            
        } else {
            askNumber();
        }
        
    });
    
}

askNumber();