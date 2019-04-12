var prompt = require('prompt');

prompt.start();

const razaoAurea = (x, y, k) => {

    let c = y;
    let a = x;
    let i = 1;

    while(i <= k){
        t = c;
        c = c + a;
        a = t;
        i = i;
    }

    return c/a;

}

const askNumber = () => { 

    prompt.get(['x', 'y', 'k'], (err, result) => {

        let x = parseInt(result.x);
        let y = parseInt(result.y);
        let k = parseInt(result.k);
        
        if(x >= 0 && x < y && 0 < k) {
            console.log(razaoAurea(x, y, k));
        } else {
            askNumber();
        }

    });

}

askNumber();