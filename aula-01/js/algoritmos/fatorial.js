/**
 * Calcula o fatorial de dado numero
 * 
 * @param {number} n numero 
 * @returns {number} f fatorial do numero
 * @returns {number} fatorial de n
 * @throws {TypeError} se argumento nao for um numero.
 * @throws {RangeError} Se o numero informado for menor que 1 
*/
function fatorial(n){

    if (typeof(n) != "number") {
        throw new TypeError("argumento deve ser um numero");
    }
    
    if (n < 1) {
        throw new RangeError("Numero deve ser maior ou igual a 1");
    }
    
    let i = 2; 
    let f = 1; 
    
    while (i <= n) {
        f = f * i; 
        i = i + 1; 
    } 
    
    return f;
    
}

module.exports = fatorial;