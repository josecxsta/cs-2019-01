/**
 * Calcula o valor PI de um numero.
 * @param {number} n numero.
 * @returns {number} valor de pi. 
 * 
 * @throws {RangeError} se numero for menor que 1.
 */
function valorPI(n) {

    if(n < 1) {
        throw new RangeError("Numero deve ser maior ou igual a 1");
    }

    let i = 1;
    let s = -1;
    let d = -1;
    let p = 0;

    while(i <= n) {
        d = d + 2;
        s = -1 * s;
        p = p + (4 * s / d);
        i = i + 1;
    }

    return p;

}

module.exports = valorPI;