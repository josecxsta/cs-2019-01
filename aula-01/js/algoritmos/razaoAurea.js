/**
 * Calcula a razao aurea
 * 
 * @param {number} x numero inteiro.
 * @param {number} y numero inteiro.
 * @param {number} k soma do x e y.
 * @returns {number} razao aurea entre x, y e k.
 * @throws {TypeError} se argumentos nao forem numerais
 * @throws {RangeError} se x for menor que 0, ou maior que y. Se k for menor que 1.
 */
function razaoAurea(x, y, k) {

    if (typeof(x) != "number" || typeof(y) != "number" || typeof(k) != "number") {
        throw new TypeError("argumentos devem ser numerais");
    }

    if (x < 0 || x > y || k <= 0) {
        throw new RangeError();
    }

    let c = y;
    let a = x;
    let i = 1;
    let t;

    while (i <= k) {
        t = c;
        c = c + a;
        a = t;
        i++;
    }

    let response = c/a;

    return response;

}

module.exports = razaoAurea;