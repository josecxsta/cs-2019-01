const crivoEratostenes = require("../algoritmos/crivoEratostenes");

test("argumento null/undefined", () => {
  expect(() => { crivoEratostenes(); }).toThrow();
});

test("argumento nao numerico", () => {
  expect(() => { crivoEratostenes("abcd", "2"); }).toThrow();
});

test("argumento de formato diferente", () => {
  expect(() => { crivoEratostenes("a", []); }).toThrow(TypeError);
});

test("argumento fora da faixa", () => {
  expect(() => { crivoEratostenes([], 1.1); }).toThrow();
});

test("numero primo", () => {
  expect(crivoEratostenes([5, 3, 1], 2)).toBe(true);
});

