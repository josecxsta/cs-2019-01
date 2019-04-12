var prompt = require('prompt');

prompt.start();

const mdc = (x, y) => {

  let m;
  while(y != 0){
    m = x % y;
    x = y;
    y = m;
  }

  return x;

}

const askNumber = () => { 

    prompt.get(['x', 'y'], (err, result) => {

        let x = parseInt(result.x);
        let y = parseInt(result.y);
        
        if(y <= x && 0 < y) {
            console.log(mdc(x, y));
        } else {
            askNumber();
        }

    });

}

askNumber();