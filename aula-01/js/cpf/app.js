var prompt = require('prompt');

prompt.start();

const cpf = d => {
  
  let j = parseInt(d[0]) + (2 * parseInt(d[1])) + (3 * parseInt(d[2])) + (4 * parseInt(d[3])) + (5 * parseInt(d[4])) + (6 * parseInt(d[5])) + (7 * parseInt(d[6])) + (8 * parseInt(d[7])) + (9 * parseInt(d[8]));

  let k = parseInt(d[1]) + (2 * parseInt(d[2])) + (3 * parseInt(d[3])) + (4 * parseInt(d[4])) + (5 * parseInt(d[5])) + (6 * parseInt(d[6])) + (7 * parseInt(d[7])) + (8 * parseInt(d[8])) + (9 * parseInt(d[9]));
  
  let dj = ((j % 11) % 10);
  let dk = ((k % 11) % 10);

  return (dj == d[9] && dk == d[10]);
  
}


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