/**
 * Calcula o logaritmo natural de um número expoente com a precisão fornecida
 * @param {number} n número expoente
 * @param {number} k precisão
 * @returns {number} logaritmo natural
 * @throws {TypeError} se argumento nao for um numero
 * @throws {RangeError} se n for menor que 1 ou k menor que 2
 */
function logaritmo(n, k) {

    if (typeof(n) != "number") {
        throw new TypeError("argumento deve ser um numero");
    }

    if (n < 1 || k < 2) {
        throw new RangeError();
    }

    let i = 2;
    let e = 1 + n;
    let numerador = n;
    let denominador = 1;

    while (i <= k) {
        numerador = numerador * numerador;
        denominador = denominador * i;
        e = e + (numerador / denominador);
        i = i + 1;
    }

    return e;

}

module.exports = logaritmo;