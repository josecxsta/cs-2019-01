/**
 * Encontra a menor temperatura em um vetor de valores recebido como argumento.
 * @param {array} temperaturas vetor de valores
 * @throws {TypeError} se argumento não for um vetor
 * @returns {number} menor valor no vetor
 */
function menorTemperatura(temperaturas) {

    if (!Array.isArray(temperaturas)) {
        throw new TypeError("argumento deve ser vetor");
    }

    return Math.min.apply(null, temperaturas);
}

module.exports = menorTemperatura;