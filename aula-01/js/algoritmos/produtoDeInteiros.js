/**
* Calcula o produto dos numeros inteiros fornecidos.
* @param {number} a multiplicando
* @param {number} b multiplicador
* @returns {number} resultado da multiplicação
* @throws {TypeError} se algum dos argumentos não for numeral
* @throws {RangeError} se algum dos argumentos não for inteiro
* @throws {RangeError} se algum dos argumentos for menor que 1
*/
function produtoDeInteiros(a, b) {

    if (typeof(a) != "number" || typeof(b) != "number") {
        throw new TypeError("argumento deve ser um numero");
    }

    if (a < 1 || b < 1) {
        throw new RangeError("argumentos devem ser maiores que 0");
    }

    if (!Number.isInteger(a) || !Number.isInteger(b)) {
        throw new RangeError("argumentos devem ser numerais inteiros");
    }

    let totalParcelas = a;
    let parcela = b;
    if (b < a) {
        totalParcelas = b;
        parcela = a;
    }

    let i = 1;
    let s = 0;
    while (i <= totalParcelas) {
        s = s + parcela;
        i = i + 1;
    }

    return s;
}

module.exports = produtoDeInteiros;