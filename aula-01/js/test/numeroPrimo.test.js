const numeroPrimo = require("../src/numeroPrimo");

test("argumento null/undefined", () => {
    expect(() => { numeroPrimo(); }).toThrow();
});

test("argumento nao numerico", () => {
    expect(() => { numeroPrimo("abcd"); }).toThrow();
});

test("argumento de formato diferente", () => {
    expect(() => { numeroPrimo("a"); }).toThrow(TypeError);
});

test("argumento fora da faixa", () => {
    expect(() => { numeroPrimo(1.1); }).toThrow();
});

test("argumento negativo", () => {
    expect(() => { numeroPrimo(-1); }).toThrow(RangeError);
});

test("numero primo", () => {
    expect(numeroPrimo(5)).toBe(true);
});

test("numero nao primo", () => {
    expect(numeroPrimo(6)).toBe(false);
});
