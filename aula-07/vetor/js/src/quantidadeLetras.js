/**
* Retornar a quantidade de cada uma das letras presentes em uma sequência de caracteres.
* @param {string} sequencia
*/
function quantidadeLetras(sequencia) {
    let quantidade = [];

    for (let index = 0; index < sequencia.length; index++) {

        const sequenciaMinuscula = sequencia.toLowerCase();

        if (sequenciaMinuscula[index] < 'a' || sequenciaMinuscula[index] > 'z') {
            continue;
        }

        if (quantidade[sequenciaMinuscula[index]] === undefined) {
            quantidade[sequenciaMinuscula[index]] = 1;
        } else {
            quantidade[sequenciaMinuscula[index]]++;
        }

    }

    return quantidade;
}

module.exports = quantidadeLetras;