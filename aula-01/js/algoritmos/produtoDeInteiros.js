
function produtoDeInteiros(a, b) {

    let totalParcelas = a;
    let parcela = b;

    if (b < a) {
        totalParcelas = b;
        parcela = a;
    }

    let i = 1;
    let s = 0;

    while (i <= totalParcelas) {
        s = s + parcela;
        i = i + 1;
    }

    return (s);
}

module.exports = produtoDeInteiros;