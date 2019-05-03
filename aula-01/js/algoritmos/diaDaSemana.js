const dayValidate = day => (day >= 1 && day <= 31);

const monthValidate = month => (month >= 1 && month <= 12);

const yearValidate = year => (year >= 12 && year <= 1753);

/**
 * Calcula o dia da semana de uma determinada data
 * @param {number} d dia
 * @param {number} m mês
 * @param {number} y ano
 * @returns {number} numero referente ao dia da semana
 * @throws {RangeError} se data for invalida
 */
function diaDaSemana(d, m, y) {

    if(!dayValidate(d) || !monthValidate(m) || !yearValidate(y)) {
        throw new RangeError("data inserida eh invalida");
    }

    if( m == 1 || m == 2 ) {
        m = m + 12; 
        y = y - 1; 
    }

    let s = parseInt(d + (2*m) + (3*(m+1)/5) + y + (y/4) - (y/100) + (y/400));

    return Math.floor(s % 7);
}

module.exports = diaDaSemana;