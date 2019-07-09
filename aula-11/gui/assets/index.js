const PATH = "http://localhost:8080/ds?di=";

function atualizaDiaDaSemana() {
    var xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function () {
        if (this.readyState == 4 && this.status == 200) {
            let dds = extraiDiaDaSemanaDaResposta(xhttp.responseText);
            document.getElementById("resultado").innerHTML = `${dds} é a diferença em dias entre as duas datas.`;
        }
    };

    let dataAnoMesDia = document.getElementById("data").value;
    let data = formataData(dataAnoMesDia);
    let dataAnoMesDia2 = document.getElementById("dataFinal").value;
    let dataFinal = formataData(dataAnoMesDia2);
    xhttp.open("GET", PATH + data + '&df=' + dataFinal , true);
    xhttp.send();
}

function dataCorrente() {
    document.getElementById("data").valueAsDate = new Date();
    document.getElementById("dataFinal").valueAsDate = new Date();
}

// Funções para integração (satisfazer contrato do servidor)

function extraiDiaDaSemanaDaResposta(resposta) {
    return resposta;
}

// Dia ou mês deve possuir dois dígitos
function formataDiaOuMes(n) {
    return ("00" + n).substr(-2, 2);
}

// Ano deve possuir quatro dígitos
function formataAno(n) {
    return ("0000" + n).substr(-4,4);
}

// ENTRADA: ano-mes-dia SAIDA: dd-mm-yyyy
function formataData(data) {
    let [a, m, d] = data.split("-");

    let dia = formataDiaOuMes(d);
    let mes = formataDiaOuMes(m);
    let ano = formataAno(a);

    return `${d}-${m}-${a}`;
}