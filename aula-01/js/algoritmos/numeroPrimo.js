/**
 * Calcula se numero eh primo.
 * @param {number} n numero.
 * @returns {boolean} se numero eh primo ou nao. 
 * 
 * @throws {RangeError} se numero for menor ou igual a 1.
*/
function primo(n) {
    
    if(n <= 1) {
        throw new RangeError("Numero deve ser maior que 1");
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