/**
* Calcula resultado de polinômio
* @param {number} n numero
* @param {array} c array de coeficientes
* @throws {TypeError} se argumento nao for numeral inteiro
* @throws {RangeError} se grau de polinômio for inválido
*/
function polinomio(n, c) {

    const grau = c.length;
    
    if (typeof(n) != "number") {
        throw new TypeError("argumento deve ser numeral");
    }
    
    if (grau < 1) {
        throw new RangeError("polinomio de grau invalido");
    }

    for (let i = 0; i < grau; i++) {
        
        if (c[i] === null || c[i] === undefined) {
            throw new TypeError("argumento deve ser numeral");
        }

        if (!Number.isInteger(c[i])) {
            throw new TypeError("argumento deve ser inteiro");
        }

    }
    
    let p = c[grau - 1];

    for (i = grau - 2; i >= 0; i--) {
        p = p * n + c[i];
    }
    
    return p;

}

module.exports = polinomio;