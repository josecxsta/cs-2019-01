/**
 * Localizar a palavra mais frequente em uma sequência de caracteres.
 * @param {string} frase
 * @throws {TypeError} se argumento não for string
 * @returns {string} palavra mais frequente
 */
function palavraMaisFrequente(frase) {

    if (typeof(frase) != "string") {
        throw new TypeError("argumento deve ser uma string");
    }

    const palavras = frase.split(" ");
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

    const palavra = repeticoes.sort((a, b) => b.repeticoes - a.repeticoes)[0].palavra;
    return palavra;
}

module.exports = palavraMaisFrequente;