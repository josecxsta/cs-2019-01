/**
 * Calcula a soma dos primeiros numeros naturais.
 * @param {number} n quantidade de numeros naturais a serem somados.
 * @returns {number} resultado da soma.
 * @throws {TypeError} se argumento nao for numeral
 * @throws {RangeError} se numero inserido for menor ou igual a 1
*/
function somaPrimeirosNaturais(n) {

    if (typeof(n) != "number") {
        throw new TypeError("argumento nao eh numero inteiro");
    }
    
    if (1 > n || !Number.isInteger(n)){
        throw new RangeError("argumento nao eh numero inteiro maior que 1");
    }
    
    let i = 2;
    let s = 1;
    
    while (i <= n) {
        s = s + i; 
        i++;
    } 
    
    return s;
    
}

module.exports = somaPrimeirosNaturais;