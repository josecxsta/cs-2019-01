/**
 * Verifica se o CPF fornecido é válido.
 *
 * @param {string} sequencia Sequência de caracteres correspondente a um CPF.
 * @returns {boolean} O valor lógico verdadeiro se...
 * @throws {TypeError} Se não é fornecido argumento ou null ou não é string.
 * @throws {RangeError} Se há caractere que não correspondente a um dígito.
*/
function cpf2(d) {

    if (d == null || typeof (d) != "string") {
        throw new TypeError("argumento deve ser uma string");
    }

    if (d.length != 11) {
        throw new RangeError("argumento deve possuir 11 caracteres");
    }

    let c = 7;
    let p = parseInt(d[8]);
    let s = parseInt(d[8]);

    while (c >= 0) {
        p = p + parseInt(d[c]);
        s = s + p;
        c = c - 1;
    }

    let j = (s % 11) % 10;
    let k = ((s - p + 9 * parseInt(d[9])) % 11) % 10;

    return (j == parseInt(d[9]) && k == parseInt(d[10]));

}

module.exports = cpf2;