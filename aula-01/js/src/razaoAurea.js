/**
 * Calcula a razao aurea entre dois numeros
 *
 * @param {number} x numero inteiro.
 * @param {number} y numero inteiro.
 * @param {number} k precisão
 * @returns {number} razao aurea entre x e y de acordo com a precisão
 * @throws {TypeError} se argumentos nao forem numerais
 * @throws {RangeError} se x for menor que 0, ou maior que y. Se k for menor que 1
 * @throws {RangeError} se argumentos nao forem números inteiros
 */
function razaoAurea(x, y, k) {

    if (typeof(x) != "number" || typeof(y) != "number" || typeof(k) != "number") {
        throw new TypeError("argumentos devem ser numerais");
    }

    if (x < 0 || x > y || k <= 0) {
        throw new RangeError("argumentos fora da faixa");
    }

    if (!Number.isInteger(x), !Number.isInteger(y), !Number.isInteger(k)) {
        throw new RangeError("argumentos devem ser numeros inteiros");
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