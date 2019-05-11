const polinomio = require("../algoritmos/polinomio");

test("argumento null/undefined", () => {
  expect(() => { polinomio(); }).toThrow();
});

test("argumento de formato diferente", () => {
  expect(() => { polinomio("a"); }).toThrow(TypeError);
});
