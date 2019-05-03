/**
 * Calcula se numero eh primo.
 * @param {number} n numero
 * @returns {boolean} se numero eh primo ou nao 
 * 
 * @throws {RangeError} se aragumento for numero menor ou igual a 1
 * @throws {TypeError} se argumento nao for um numero
*/
function primo(n) {

    if(typeof(n) != 'number') {
        throw new TypeError("Argumento deve ser um numero.")
    }
    
    if(n <= 1) {
        throw new RangeError("Argumento deve ser um numero maior que 1.");
    }
    
    let i = 2; 
    
    while (i < n) {
        
        if(n % i == 0) {
            return false; 
        }
        
        i++;
    }
    
    return true;
    
}

module.exports = primo;