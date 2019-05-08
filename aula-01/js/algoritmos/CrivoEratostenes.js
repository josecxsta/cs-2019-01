/**
 * Calcula o Crivo de Eratostenes dado uma coleção de numeros e um limite.
 *
 * @param {number} a colecao de numeros
 * @param {number} n limite
 * @returns {boolean} a
 * @throws {TypeError} se argumento nao for um numero.
 * @throws {RangeError} se parametro nao for numero maior que 1.
*/
function crivoEratostenes(a, n) {

    if (typeof(n) != "number") {
        throw new TypeError("argumento deve ser um numero");
    } 
    
    if (n < 2) {
        throw new RangeError("argumento deve ser um numero maior que 1");
    }
    
    let i = 2; 
    const limite = Math.sqrt(n);
    
    while (i <= limite) {
        
        if (a[i] == 0) {
            
            let multiplo = i + i;
            
            while (multiplo <= n) {
                a[multiplo] = 1;
                multiplo++;
            }
            
        }
        
        i++;
        
    } 
    
    return (a[n] == 1);
    
}

module.exports = crivoEratostenes;