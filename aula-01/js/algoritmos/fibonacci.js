/**
 * Calcula o n-esimo numero da sequência de Fibonacci.
 * 
 * @param {number} n numero.
 * @returns {number} c n-esimo numero de Fibonacci.
 * @throws {TypeError} se argumento nao for um numero.
 * @throws {RangeError} Se numero inserido for menor que zero. 
*/
function fibonacci(n) {

    if (typeof(n) != "number") {
        throw new TypeError("argumento deve ser um numero");
    }
    
    if (n < 0) {
        throw new RangeError("Numero deve ser maior ou igual a zero.");
    }
    
    let a = 0;
    let c = 1;
    
    if (n == 0 || n == 1) {
        return n;
    }
    
    let i = 2;
    let t;
    
    while (i <= n) {
        t = c;
        c = c + a;
        a = t;
        i++;
    }
    
    return c;
    
}

module.exports = fibonacci;