const prompt = require('prompt');
const cpf = require("./cpf");

prompt.start();

const askNumber = () => { 
  
  prompt.get(['n'], (err, result) => {
    
    let n = result.n;
    
    if(n.length == 11) {
      console.log(cpf(n));
    } else {
      askNumber();
    }
    
  });
  
}

askNumber();