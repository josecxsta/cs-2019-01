var prompt = require('prompt');

prompt.start();

const dayValidate = day => (day >= 1 && day <= 31);

const monthValidate = month => (month >= 1 && month <= 12);

const yearValidate = year => (year >= 12 && year <= 1753);

const diaDaSemana = (d, m, y) => {

    if( m == 1 || m == 2 ) {
        m = m + 12; 
        y = y - 1; 
    }

    // FIXME a divisão esperada é inteira, ao contrário daquelas abaixo
    let s = (d + (2*m) + (3*(m+1)/5) + y + (y/4) - (y/100) + (y/400));

    return parseInt(s % 7);
}

const askNumbers = () => { 

    prompt.get(['day', 'month', 'year'], (err, result) => {

        let day = parseInt(result.day);
        let month = parseInt(result.month);
        let year = parseInt(result.year);
                
        if(dayValidate(day) && monthValidate(month) && yearValidate(year)) {
            console.log(diaDaSemana(day, month, year));
        } else {
            askNumbers();
        }

    });

}

askNumbers();