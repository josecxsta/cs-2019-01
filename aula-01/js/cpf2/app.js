
function cpf2(d){

    let c = 7;
    let p = parseInt(d[8]);
    let s = parseInt(d[8]);

    while(c >= 0) {
        p = p + parseInt(d[c]);
        s = s + p;
        c = c - 1;
    }

    let j = (s % 11) % 10;
    let k = ((s - p + 9 * parseInt(d[9])) % 11) % 10;

    return (j == parseInt(d[9]) && k == parseInt(d[10]));

}
