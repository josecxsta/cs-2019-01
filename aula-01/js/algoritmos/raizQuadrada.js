function raizQuadrada(x, y) {

    if (typeof(x) != "number" || typeof(y) != "number") {
        throw new TypeError("argumento deve ser um numero");
    }

    if (x <= 0) {
        throw new RangeError("argumento deve ser maior do que zero");
    }
    
    let r = 1;
    
    while (0 <= y) {
        r = (r + (x/r))/2;
        y = y - 1;
    }
    
    return r;
    
}

module.exports = raizQuadrada;