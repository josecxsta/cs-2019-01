/**
 * Calcula se numero satisfaz a propriedade 3025.
 * @param {number} number numero.
 * @returns {boolean} se numero satisfaz a propriedade 3025.
 * 
 * @throws {RangeError} se numero nao for inteiro ou nao estiver entre 0 e 9999.
 */
function propriedade3025 (number) {

    if(number < 0 || number > 9999 || !Number.isInteger(number)) {
        throw new RangeError("Numero deve ser entre 0 e 9999");
    }

    const i = parseInt(number / 100);
    const j = parseInt(number % 100);
    const x = Math.pow((i + j), 2);

    return (x == number);

} 

module.exports = propriedade3025;