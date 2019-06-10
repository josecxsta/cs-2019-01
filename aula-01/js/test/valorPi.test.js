const valorPi = require("../src/valorPi");

test("argumento null/undefined", () => {
    expect(() => { valorPi(); }).toThrow();
});

test("argumento nao numerico", () => {
    expect(() => { valorPi("abcd"); }).toThrow();
});

test("argumento de formato diferente", () => {
    expect(() => { valorPi("a"); }).toThrow(TypeError);
});

test("numero fora da faixa", () => {
    expect(() => valorPi(-2)).toThrow(RangeError);
});

test("numero nao inteiro", () => {
  expect(() => valorPi(1.2)).toThrow(RangeError);
});

test("pi", () => {
  expect(valorPi(1)).toBe(4);
});
