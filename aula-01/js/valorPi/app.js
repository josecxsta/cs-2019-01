var prompt = require('prompt');

prompt.start();

const valorPI = n => {

    let i = 1;
    let s = -1;
    let d = -1;
    let p = 0;

    while(i <= n){
        d = d + 2;
        s = -1 * s;
        p = p + (4 * s / d);
        i = i + 1;
    }

    return p;

}

const askNumber = () => { 

    prompt.get(['x'], (err, result) => {

        let x = result.x;
        
        if(x <= 1) {

            console.log(valorPI(x));

        } else {
            askNumber();
        }

    });

}

askNumber();