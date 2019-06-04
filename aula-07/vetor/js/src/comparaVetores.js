/**
* Retorna a quantidade de elementos do vetor recebido como primeiro
* argumento cujos valores são iguais ao valor do segundo argumento fornecido.
* @param {array} vetor1
* @param {array} vetor2
*/
function comparaVetores(vetor1, vetor2) {
    return vetor1.filter(x => vetor2.includes(x));
}

module.exports = comparaVetores;