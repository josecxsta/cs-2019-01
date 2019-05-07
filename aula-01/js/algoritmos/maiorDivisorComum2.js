/**
* Calcula maior divisor comum entre dois numeros.
*
* @param {number} a.
* @param {number} b.
*
* @returns {number} a maior divisor comum entre a e b.
*
* @throws {TypeError} Se um dos parametros nao for numero.
* @throws {RangeError} Se b for maior que a ou b menor do que zero.
*/
function maiorDivisorComum2(a, b) {
    
    if (typeof(a) != "number" || typeof(b) != "number") {
        throw new TypeError("Os parametros devem ser numerais");
    }
    
    if (b > a || b < 0) {
        throw new RangeError("b nao pode ser maior que a e deve ser maior ou igual a zero."); 
    }
    
    while (a != b) {
        
        if (a > b) {
            a = a - b; 
        } else {
            b = b - a;
        } 
    } 
    
    return a;
    
}

module.exports - maiorDivisorComum2;