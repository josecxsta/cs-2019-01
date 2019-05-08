/**
 * 
 * @param {number} n 
 * @throws {TypeError} se argumento nao for um numero
 */
function polinomio(n) {

    if (typeof(n) != "number") {
        throw new TypeError("argumento deve ser um numero");
    }

    let i = 2;

    while (i < n) {
        if (n % i == 0) {
            return false;
        }

        i++;
    }

    return true;
}

module.exports = polinomio;