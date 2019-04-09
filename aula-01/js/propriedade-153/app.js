var prompt = require('prompt');

prompt.start();

const prop153 = number => {
    let c = parseInt(number / 100);
    let du = parseInt(number % 100);
    let d = parseInt(du / 10);
    let u = parseInt(du % 10);

    let c3 = Math.pow(c, 3);
    let d3 = Math.pow(d, 3);
    let u3 = Math.pow(u, 3);

    let x = c3 + d3 + u3;

    return (x == number);
}

const askNumber = () => { 

    prompt.get(['number'], (err, result) => {

        let number = result.number;
        
        if(number >= 100 && number <= 999) {

            let isSatistified = prop153(number);
            console.log(isSatistified);


        } else {
            askNumber();
        }

    });

}

askNumber();