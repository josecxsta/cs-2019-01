/**
 * 
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