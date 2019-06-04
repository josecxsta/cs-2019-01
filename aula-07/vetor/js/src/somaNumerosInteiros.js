/**
 * Retorna a soma de números ímpares contidos em um vetor de inteiros.
 * @param {array} numerosInteiros
 */
function somaNumerosImpares(numerosInteiros) {
    const impares = numerosInteiros.filter(ehImpar);
    return impares.reduce(somaNumeros, 0);
}

function ehImpar(numero) {
    return numero % 2 != 0;
}

function somaNumeros(a, b) {
    return a + b;
}

module.exports = somaNumerosImpares;