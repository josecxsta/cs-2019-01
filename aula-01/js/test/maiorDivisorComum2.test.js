const mdc = require("../algoritmos/maiorDivisorComum2");

test("argumento null/undefined", () => {
  expect(() => { mdc(); }).toThrow();
});

test("argumento nao numerico", () => {
  expect(() => { mdc("abcd"); }).toThrow();
});

test("argumento de formato diferente", () => {
  expect(() => { mdc("a", "b"); }).toThrow(TypeError);
});

test("devem ser dois numerais", () => {
  expect(() => mdc(5)).toThrow(TypeError);
});

test("certos", () => {
  expect(mdc(12, 6)).toEqual(6);
  expect(mdc(18, 15)).toEqual(3);
});

test("fora da faixa", () => {
  expect(() => { mdc(2, -1); }).toThrow(RangeError);
});