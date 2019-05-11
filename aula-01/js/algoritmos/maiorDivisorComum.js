/**
 * Calcula maior divisor comum entre dois numeros.
 * @param {number} x 1º numero
 * @param {number} y 2º numero
 * @returns {number} x maior divisor comum entre x e y.
 * @throws {TypeError} Se um dos parametros nao for numero.
 * @throws {RangeError} Se y for maior que x ou y menor do que zero.
*/
function maiorDivisorComum(x, y) {
    
    if (typeof(x) != "number" || typeof(y) != "number") {
        throw new TypeError();
    }
    
    if (y > x || y < 0) {
        throw new RangeError(); 
    }
    
    let m;
    
    while (y != 0) {
        m = x % y;
        x = y;
        y = m;
    }
    
    return x;
    
}

module.exports = maiorDivisorComum;