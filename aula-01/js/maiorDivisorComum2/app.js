/**
* Maior divisor comum entre dois numeros
*
* @param {number} a
* @param {number} b
*
* @returns {number} 
*
* @throws {TypeError} Se não é fornecido argumento ou null ou não é string.
* @throws {RangeError} Se há caractere que não correspondente a um dígito.
*/
function maiorDivisorComum2(a, b) {
    
    if(typeof(a) != 'number' || typeof(b) != 'number'){
        throw new TypeError();
    }
    
    if(b > a || b < 0){
        throw new RangeError(); 
    }
    
    while(a != b) {
        
        if(a > b) {
            a = a - b; 
        } else {
            b = b - a;
        } 
    } 
    
    return a;
    
}