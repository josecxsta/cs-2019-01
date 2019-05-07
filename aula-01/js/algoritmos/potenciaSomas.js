function potenciaSomas(x, y) {

    let potencia = 1; 
    let i = 1;

    while (i <= y) {
        potencia = potencia * x;
        i++;
    }

    return potencia;
}

module.exports = potenciaSomas;