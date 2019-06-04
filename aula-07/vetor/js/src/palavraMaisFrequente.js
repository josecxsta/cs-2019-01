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

module.exports = palavraMaisFrequente;