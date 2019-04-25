var prompt = require('prompt');

prompt.start();

// VEJA COMO PREJUDICAR A LEGIBILIDADE (mantendo a funcionalidade)
const prop3025 = number => (parseInt(number / 100) + parseInt(number % 100))**2 == number;

const askNumber = () => { 

    prompt.get(['number'], (err, result) => {

        let number = result.number;
        
        if(number >= 0 && number <= 9999) {

            let isSatistified = prop3025(number);
            console.log(isSatistified);

        } else {
            askNumber();
        }

    });

}

askNumber();