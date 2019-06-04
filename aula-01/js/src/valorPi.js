/**
 * Produz uma aproximação do valor de PI baseado no número de iterações fornecido, onde quanto maior o número de iterações, maior a precisão de PI
 * @param {number} n numero de iteracoes
 * @returns {number} aproximacao do valor de PI
 * @throws {TypeError} se argumento nao for um numero
 * @throws {RangeError} se numero for menor que 1
 * @throws {RangeError} se argumento nao for numero inteiro
 */
function valorPI(n) {

    if (typeof(n) != "number") {
        throw new TypeError("argumento deve ser um numero");
    }

    if (n < 1) {
        throw new RangeError("argumento deve ser numero maior ou igual a 1");
    }

    if (!Number.isInteger(n)) {
        throw new RangeError("argumento deve ser numero inteiro");
    }

    let i = 1;
    let s = -1;
    let d = -1;
    let p = 0;
    while (i <= n) {
        d = d + 2;
        s = -1 * s;
        p = p + (4 * s / d);
        i = i + 1;
    }

    return p;
}

module.exports = valorPI;