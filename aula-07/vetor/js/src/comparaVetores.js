/**
* Retorna a quantidade de elementos do vetor recebido como primeiro
* argumento cujos valores são iguais ao valor do segundo argumento fornecido.
* @param {array} vetor1 primeiro vetor
* @param {array} vetor2 segundo vetor
* @throws {RangeError} se argumentos não forem vetores
* @returns {array} valores em comuns entre os vetores
*/
function comparaVetores(vetor1, vetor2) {

    if (!Array.isArray(vetor1) || !Array.isArray(vetor2)){
        throw new TypeError("argumentos devem ser vetores");
    }

    return vetor1.filter(x => vetor2.includes(x));
}

module.exports = comparaVetores;