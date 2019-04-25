var prompt = require('prompt');

prompt.start();

const primo = (n) => {

    let i = 2;
    while (i < n) {
        if (n % i == 0) {
            return false;
        }

        i++;
    }

    return true;
}

const askNumber = () => {

    prompt.get(['x'], (err, result) => {

        let x = parseInt(result.x);

        if (x > 1) {
            console.log(primo(x));
        } else {
            askNumber();
        }

    });

}

askNumber();