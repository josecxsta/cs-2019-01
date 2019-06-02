/**
 * Calcula se numero satisfaz a propriedade 153.
 * @param {number} number numero.
 * @returns {boolean} se numero satisfaz a propriedade 153.
 * @throws {TypeError} se argumento nao for numeral
 * @throws {RangeError} se argumento nao for numero inteiro entre 100 e 999.
 */
function propriedade153(number) {

    if (typeof(number) != "number") {
        throw new TypeError("argumento deve ser numeral");
    }

    if (number < 100 || number > 999 || !Number.isInteger(number)) {
        throw new RangeError("argumento deve ser numero inteiro entre 100 e 999");
    }

    const c = parseInt(number / 100);
    const du = parseInt(number % 100);
    const d = parseInt(du / 10);
    const u = du % 10;
    const c3 = Math.pow(c, 3);
    const d3 = Math.pow(d, 3);
    const u3 = Math.pow(u, 3);
    const x = c3 + d3 + u3;

    return (x == number);
}

module.exports = propriedade153;