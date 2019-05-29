
/**
 * Encontra a menor temperatura em um vetor de valores recebido como argumento.
 * @param {array} temperaturas
 */
function menorTemperatura(temperaturas) {
    return Math.min.apply(null, temperaturas);
}

/**
 * Retorna a soma de números ímpares contidos em um vetor de inteiros.
 * @param {array} numerosInteiros
 */
function somaNumerosImpares(numerosInteiros) {
    const impares = numerosInteiros.filter(ehImpar);
    return impares.reduce(somaNumeros, 0);
}

function ehImpar(numero) {
    return numero % 2 != 0;
}

function somaNumeros(a, b) {
    return a + b;
}

/**
 * Retorna a quantidade de elementos do vetor recebido como primeiro
 * argumento cujos valores são iguais ao valor do segundo argumento fornecido.
 * @param {array} vetor1
 * @param {array} vetor2
 */
function comparaVetores(vetor1, vetor2) {
    return vetor1.filter(x => vetor2.includes(x));
}

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

/**
 * Localizar a palavra mais frequente em uma sequência de caracteres.
 * @param {string} frase
 */
function palavraMaisFrequente(frase) {
    const palavras = frase.split(' ');
    let repeticoes = [];
    palavras.forEach(palavra => {
        if (!repeticoes.find(rep => rep.palavra == palavra)) {
            repeticoes.push({
                palavra: palavra,
                repeticoes: 0
            });
        } else {
            repeticoes.find(rep => rep.palavra == palavra).repeticoes++;
        }

    });

    return repeticoes.sort((a, b) => b.repeticoes - a.repeticoes)[0].palavra;
}

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
    if (maiores.length == 1) {
        maiores = maiores[0];
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
    if (typeof(min) != number || typeof(max) != number) {
        throw TypeError("argumentos devem ser numericos");
    }

    return Math.floor(Math.random() * (max - min)) + min;
}
