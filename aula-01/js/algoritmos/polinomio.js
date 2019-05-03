function polinomio(n) {

    let i = 2;
    while (i < n) {
        if (n % i == 0) {
            return false;
        }

        i++;
    }

    return true;
}

module.exports = polinomio;