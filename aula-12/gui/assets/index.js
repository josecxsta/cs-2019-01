/**
 * Caminho para requisições a API.
 */
const PATH = "http://localhost:8080/ds?num=";

/**
 * Faz a requisição e atualiza o número na página.
 */
function atualizaNumeroPorExtenso() {
    let xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function () {
        if (this.readyState == 4 && this.status == 200) {
            let dds = extraiResposta(xhttp.responseText);
            document.getElementById("resultado").innerHTML
            = `${dds}`;
        }
    };

    let numero = document.getElementById("numero").value;

    xhttp.open("GET", PATH + numero, true);
    xhttp.send();
}

/**
 * Pega resposta do servidor.
 * @param {number} resposta resposta resposta do servidor
 */
function extraiResposta(resposta) {
    return resposta;
}
