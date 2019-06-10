const funcao = require("../src/somaPrimeirosNaturais");

test("25", () => {
    expect(funcao(25)).toBe(325);
});

test("5", () => {
    expect(funcao(5)).toBe(15);
});

test("argumento null/undefined", () => {
    expect(() => { funcao(); }).toThrow();
});

test("argumento nao numerico", () => {
    expect(() => { funcao("abcd"); }).toThrow(TypeError);
});

test("valor negativo fora da faixa", () => {
    expect(() => { funcao(-1); }).toThrow(RangeError);
});

test("valor deve ser inteiro", () => {
    expect(() => funcao(10.3)).toThrow(RangeError);
});