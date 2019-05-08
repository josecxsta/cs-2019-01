/**
 * Calcula potencia apenas usando somas.
 * @param {number} x numero
 * @param {number} y numero de iteracoes para calcular a potencia de x
 * @returns {number} potencia
 * @throws {TypeError} Se um dos parametros nao for numero.
 * @throws {RangeError} Se algum dos numeros for menor que zero.
*/
function potenciaSomas(x, y) {
    
    if (typeof(x) != "number" || typeof(y) != "number") {
        throw new TypeError("os parametros devem ser numerais");
    }
    
    if (x < 0 || y < 0) {
        throw new RangeError("os parametros nao podem ser menores que zero"); 
    }
    
    let potencia = 1; 
    let i = 1;
    
    while (i <= y) {
        potencia = potencia * x;
        i++;
    }
    
    return potencia;
}

module.exports = potenciaSomas;