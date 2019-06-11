const quantidadeLetras = require("../src/quantidadeLetras");

test("erro", () => {
    expect(() => { quantidadeLetras(1) }).toThrow();
});

test("software-construction", () => {
    expect(quantidadeLetras("software-construction").toStrictEqual([1]));
});