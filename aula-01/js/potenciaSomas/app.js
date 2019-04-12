var prompt = require('prompt');

prompt.start();

const potenciaSomas = (x, y) => {

    let potencia = 1; 
    let i = 1;

    while(i <= y){
        potencia = potencia * x;
        i++;
    }

    return potencia;
}

const askNumber = () => { 

    prompt.get(['x', 'y'], (err, result) => {

        let x = result.x;
        let y = result.y;
        
        if(0 <= y && 0 < x) {

            console.log(potenciaSomas(x, y));

        } else {
            askNumber();
        }

    });

}

askNumber();