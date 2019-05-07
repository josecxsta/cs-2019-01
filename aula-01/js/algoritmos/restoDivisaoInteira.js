/**
 * Calcula o resto da divisao entre dois numeros.
 * @param {number} x 
 * @param {number} y
 * @returns {number} resto da divisao entre x e y.
 * 
 * @throws {RangeError} se um dos numeros for menor que zero.
 */
function restoDivisao(x, y) {
    
    if (y < 0 || x < 0) {
        throw new RangeError("Numeros devem ser maiores que zero.");
    }
    
    let s = x;

    while (y <= s) {
        s = s -y;
    }

    return s;
}

module.exports = restoDivisao;