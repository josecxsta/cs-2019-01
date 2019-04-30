/**
 * Verifica se o CPF fornecido é válido.
 *
 * @param {string} d Sequência de caracteres correspondente a um CPF.
 *
 * @returns {boolean} O valor lógico verdadeiro se...
 *
 * @throws {TypeError} Se não é fornecido argumento ou null ou não é string.
 * @throws {RangeError} Se há caractere que não correspondente a um dígito.
 */
function cpf(d) {

    if (d == null || typeof (d) != "string") {
        throw new TypeError("argumento deve ser uma string");
    }

    if (d.length != 11) {
        throw new RangeError("argumento deve possuir 11 caracteres");
    }

    d = convertStringToArray(d);

    const j = d[0] + (2 * d[1]) + (3 * d[2]) + (4 * d[3]) + (5 * d[4]) + (6 * d[5]) + (7 * d[6]) + (8 * d[7]) + (9 * d[8]);
    const k = d[1] + (2 * d[2]) + (3 * d[3]) + (4 * d[4]) + (5 * d[5]) + (6 * d[6]) + (7 * d[7]) + (8 * d[8]) + (9 * d[9]);

    const dj = ((j % 11) % 10);
    const dk = ((k % 11) % 10);

    return (dj == d[9] && dk == d[10]);
}

/**
 * Converte cada caracteres de um sequência produzindo um vetor de inteiros
 * correspondente.
 *
 * @param {string} sequencia A sequência de caracteres para a qual um vetor de
 * inteiros será criado.
 *
 * @returns {array} Vetor de inteiros correspondente aos caracteres da
 * sequência fornecida.
 *
 */
function convertStringToArray(sequencia) {
    let inteiros = [];
    for (let caractere of sequencia) {
        inteiros.push(parseInt(caractere));
    }

    return inteiros;
}

module.exports = cpf;