var prompt = require('prompt');

prompt.start();

const raizQuadrada = (x, y) => {

  let r = 1;
  
  while(0 <= y){
    r = (r + (x/r))/2;
    y = y - 1;
  }

  return r;

}

const askNumber = () => { 

    prompt.get(['x', 'y'], (err, result) => {

        let x = parseInt(result.x);
        let y = parseInt(result.y);
        
        if(x > 0) {
            console.log(raizQuadrada(x, y));
        } else {
            askNumber();
        }

    });

}

askNumber();