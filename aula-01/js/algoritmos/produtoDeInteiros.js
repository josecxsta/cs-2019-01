var prompt = require("prompt");

prompt.start();

function produto(a, b) {

    let totalParcelas = a;
    let parcela = b;

    if(b < a){
        totalParcelas = b;
        parcela = a;
    }

    let i = 1;
    let s = 0;

    while(i <= totalParcelas){
        s = s + parcela;
        i = i + 1;
    }

    return (s);
}

const askNumbers = () => { 

    prompt.get(["a", "b",], (err, result) => {

        let a = parseInt(result.a);
        let b = parseInt(result.b);
                
        if(a >= 0 &&  b >= 0) {
            console.log(produto(a, b));
        } else {
            askNumbers();
        }

    });

};

askNumbers();