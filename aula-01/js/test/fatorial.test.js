const fatorial = require("../src/fatorial");

test("argumento null/undefined", () => {
    expect(() => { fatorial(); }).toThrow();
});

test("argumento nao numerico", () => {
    expect(() => { fatorial("abcd"); }).toThrow();
});

test("argumento de formato diferente", () => {
    expect(() => { fatorial("a"); }).toThrow(TypeError);
});

test("numero fora da faixa", () => {
    expect(() => fatorial(-2)).toThrow(RangeError);
});

test("fatorial de 4", () => {
    expect(fatorial(4)).toEqual(24);
});

test("fatorial de 5", () => {
    expect(fatorial(5)).toEqual(120);
});