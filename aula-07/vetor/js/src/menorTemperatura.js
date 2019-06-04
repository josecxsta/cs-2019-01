/**
 * Encontra a menor temperatura em um vetor de valores recebido como argumento.
 * @param {array} temperaturas
 */
function menorTemperatura(temperaturas) {
    return Math.min.apply(null, temperaturas);
}

module.exports = menorTemperatura;