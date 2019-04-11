var prompt = require('prompt');

prompt.start();

const restoDivisao = (x, y) => {
    let s = x;

    while(y <= s){
        s = s -y;
    }

    return s;
}

const askNumber = () => { 

    prompt.get(['x', 'y'], (err, result) => {

        let x = result.x;
        let y = result.y;
        
        if(0 <= y && 0 < x) {

            console.log(restoDivisao(x, y));

        } else {
            askNumber();
        }

    });

}

askNumber();