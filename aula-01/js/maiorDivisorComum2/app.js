/**
 * Maior divisor comum entre .
 *
 * @param {string} a
 *
 * @returns {boolean} 
 *
 * @throws {TypeError} Se não é fornecido argumento ou null ou não é string.
 * @throws {RangeError} Se há caractere que não correspondente a um dígito.
 */
function maiorDivisorComum2(a, b) {

    while(a != b) {
        
        if(a > b) {
            a = a - b; 
        } else {
            b = b - a;
        } 
    } 

    return a;

}