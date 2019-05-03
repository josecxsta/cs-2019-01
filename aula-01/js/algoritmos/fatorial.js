/**
 * Calcula o fatorial de dado numero
 * 
 * @param {number} n numero 
 * @returns {number} f fatorial do numero
 * 
 * @throws {RangeError} Se o numero informado for menor que 1 
*/
function fatorial(n){
    
    if(n < 1) {
        throw new RangeError("Numero deve ser maior ou igual a 1");
    }
    
    let i = 2; 
    let f = 1; 
    
    while(i <= n) {
        f = f * i; 
        i = i + 1; 
    } 
    
    return f;
    
}

module.exports = fatorial;