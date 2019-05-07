/**
 * Calcula a razao aurea
 * 
 * @param {number} x numero inteiro.
 * @param {number} y numero inteiro.
 * @param {number} k soma do x e y.
 * @returns {number} razao aurea entre x, y e k.
 * 
 * @throws {RangeError}
 */
function razaoAurea(x, y, k) {

    if (x < 0 || x > y || k <= 0) {
        throw new RangeError();
    }

    let c = y;
    let a = x;
    let i = 1;
    let t;

    while (i <= k) {
        t = c;
        c = c + a;
        a = t;
        i++;
    }

    let response = c/a;

    return response;

}

module.exports = razaoAurea;