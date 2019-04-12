var prompt = require('prompt');

prompt.start();

const quadradoPerfeito = (n) => {

  let i = 1;
  let s = 1;

  while(s < n){
    i = i + 2;
    s = s + 1;
  }

  return (s == n);

}

const askNumber = () => { 

    prompt.get(['x'], (err, result) => {

        let x = parseInt(result.x);
        
        if(1 <= x) {
            console.log(quadradoPerfeito(x));
        } else {
            askNumber();
        }

    });

}

askNumber();