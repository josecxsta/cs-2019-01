/**
 * Sortea aleatoriamente 1.000.000 de valores inteiros de 0 a 1000 e
 * identifica o número que mais foi sorteado.
 * Se mais de um número foi o “mais frequente”, então todos eles
 * deverão ser retornados (em uma coleção) juntamente com a quantidade
 * de vezes em que ocorrerão.
 */
function sorteio() {
    const quantidade = 1000000;
    const numeroMaximo = 1000;
    let sorteados = [];
    for (let index = 0; index < quantidade; index++) {
        let numero = numeroAleatorio(0, numeroMaximo);

        if (!sorteados.find(sort => sort.numero == numero)) {
            sorteados.push({
                numero: numero,
                quantidade: 0
            });
        } else {
            sorteados.find(sort => sort.numero == numero).quantidade++;
        }
    }

    const sorteadosEmOrdem = sorteados.sort((a, b) => b.quantidade - a.quantidade);
    let maiores = sorteadosEmOrdem.filter(sort => sort.quantidade == sorteadosEmOrdem[0].quantidade);
    let resultado;
    if (maiores.length == 1) {
        resultado = maiores[0].numero;
    } else {
        maiores.forEach(numero => {
            resultado.push(numero);
        });
    }

    return maiores;
}

/**
 * Calcula um numero aleatório entre um intervalo.
 * @param {number} min início do intervalo.
 * @param {number} max fim do intervalo.
 * @throws {TypeError} se argumentos não forem números.
 * @returns {number} numero aleatório.
 */
function numeroAleatorio(min, max) {
    if (typeof(min) != "number" || typeof(max) != "number") {
        throw TypeError("argumentos devem ser numericos");
    }

    return Math.floor(Math.random() * (max - min)) + min;
}

module.exports = sorteio;