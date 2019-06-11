/**
 * Retorna a soma de números ímpares contidos em um vetor de inteiros.
 * @param {array} numerosInteiros
 * @throws {TypeError} se argumento não for um vetor
 * @returns {number} soma dos números ímpares
 */
function somaNumerosImpares(numerosInteiros) {
    if (!Array.isArray(numerosInteiros)) {
        throw new TypeError("argumento deve ser um vetor");
    }

    const impares = numerosInteiros.filter(ehImpar);
    return impares.reduce(somaNumeros, 0);
}

/**
 * Verifica se número é ímpar
 * @param {number} numero
 * @returns {boolean} se é ímpar
 */
function ehImpar(numero) {
    return numero % 2 != 0;
}

/**
 * Soma dois números
 * @param {number} num1 primeiro número
 * @param {number} num2 segundo número
 * @returns {number} soma dos dois números
 */
function somaNumeros(num1, num2) {
    return num1 + num2;
}

module.exports = somaNumerosImpares;
