const quantidadeLetras = require("../src/quantidadeLetras");

test("erro", () => {
    expect(() => { quantidadeLetras(1) }).toThrow();
});