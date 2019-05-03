/**
 * Calcula se numero satisfaz a propriedade 153.
 * @param {number} number numero.
 * @returns {boolean} se numero satisfaz a propriedade 153.
 * 
 * @throws {RangeError} se numero nao estiver entre 100 e 999.
 */
function propriedade153(number) {

    if(number < 100 || number > 999) {
        throw new RangeError("Numero deve ser entre 0 e 9999");
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