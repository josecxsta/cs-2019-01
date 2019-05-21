const produtoDeInteiros = require("../algoritmos/produtoDeInteiros");

test("argumento null/undefined", () => {
    expect(() => { produtoDeInteiros(); }).toThrow();
});

test("argumento nao numerico", () => {
    expect(() => { produtoDeInteiros("abcd", "2"); }).toThrow();
});

test("numero fora da faixa", () => {
    expect(() => produtoDeInteiros(-2, 1)).toThrow(RangeError);
});

test("10 e 2", () => {
    expect(produtoDeInteiros(10, 2)).toBe(20);
});

