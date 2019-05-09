const polinomio = require("../algoritmos/polinomio");

test("argumento null/undefined", () => {
  expect(() => { polinomio(); }).toThrow();
});

test("argumento nao numerico", () => {
  expect(() => { polinomio("abcd"); }).toThrow();
});

test("argumento de formato diferente", () => {
  expect(() => { polinomio("a"); }).toThrow(TypeError);
});

test("falso", () => {
  expect(polinomio(4)).toEqual(false);
});

test("verdadeiro", () => {
  expect(polinomio(5)).toEqual(true);
});