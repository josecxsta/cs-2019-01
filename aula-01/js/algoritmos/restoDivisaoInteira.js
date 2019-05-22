/**
 * Calcula o resto da divisao entre dois numeros inteiros
 * @param {number} x numerador
 * @param {number} y denominador
 * @returns {number} resto da divisao entre os dois numeros
 * @throws {TypeError} se argumentos nao forem numerais
 * @throws {RangeError} se um dos numeros for menor que zero
 * @throws {RangeError} se algum dos argumentos nao for inteiro
 */
function restoDivisao(x, y) {

    if (typeof(x) != "number" || typeof(y) != "number") {
        throw new TypeError("argumentos devem ser numerais");
    }

    if (y < 0 || x < 0) {
        throw new RangeError("numeros devem ser maiores que zero");
    }

    if (!Number.isInteger(x) || !Number.isInteger(y)) {
        throw new RangeError("argumentos devem ser numeros inteiros");
    }

    let s = x;
    while (y <= s) {
        s = s -y;
    }

    return s;
}

module.exports = restoDivisao;