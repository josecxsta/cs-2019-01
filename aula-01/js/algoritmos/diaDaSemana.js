/**
 * Valida o dia
 * @param {number} day
 * @returns {boolean} se o é válido (entre 1 e 31)
 */
function dayValidate(day) {
    return day >= 1 && day <= 31;
}

/**
 * Valida o mês
 * @param {number} month
 * @returns {boolean} se o é válido (entre 1 e 12)
 */
function monthValidate(month) {
    return month >= 1 && month <= 12;
}

/**
 * Valida o ano
 * @param {number} year
 * @returns {boolean} se o é válido (entre 12 e 1753)
 */
function yearValidate(year) {
    return year >= 12 && year <= 1753;
}

/**
 * Calcula o dia da semana de uma determinada data
 * @param {number} d dia
 * @param {number} m mês
 * @param {number} y ano
 * @returns {number} numero referente ao dia da semana
 * @throws {TypeError} se algum dos argumentos nao for numero
 * @throws {RangeError} se data for invalida
 * @throws {RangeError} se argumentos nao forem numeros inteiros
 */
function diaDaSemana(d, m, y) {

    if (typeof(d) != "number", typeof(m) != "number", typeof(y) != "number") {
        throw new TypeError("argumentos devem ser numerais");
    }
    
    if (!Number.isInteger(d), !Number.isInteger(m), !Number.isInteger(y)) {
        throw new RangeError("numeros devem ser inteiros");
    }

    if (!dayValidate(d) || !monthValidate(m) || !yearValidate(y)) {
        throw new RangeError("data inserida eh invalida");
    }

    if ( m == 1 || m == 2 ) {
        m = m + 12; 
        y = y - 1; 
    }

    let s = parseInt(d + (2*m) + (3*(m+1)/5) + y + (y/4) - (y/100) + (y/400));

    return Math.floor(s % 7);
}

module.exports = diaDaSemana;