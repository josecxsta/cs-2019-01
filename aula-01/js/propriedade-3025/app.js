var prompt = require('prompt');

prompt.start();

const prop3025 = number => {
    let i = parseInt(number / 100);
    let j = parseInt(number % 100);

    let x = Math.pow((i + j), 2);

    return (x == number);
}

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