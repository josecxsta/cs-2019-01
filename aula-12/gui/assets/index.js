// Path para a requisição (URL)
const PATH = "http://localhost:8080/ds?num=";

function atualizaNumeroPorExtenso() {
    var xhttp = new XMLHttpRequest();
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

// Funções para integração (satisfazer contrato do servidor)

function extraiResposta(resposta) {
    return resposta;
}
