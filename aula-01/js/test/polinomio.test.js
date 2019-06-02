const polinomio = require("../algoritmos/polinomio");

test("argumento null/undefined", () => {
    expect(() => { polinomio(); }).toThrow();
});

test("argumento de formato diferente", () => {
    expect(() => { polinomio("a"); }).toThrow(TypeError);
});

test("polinomio", () => {
  expect(polinomio(2, [1, 2, 3])).toBe(17);
});

test("grau 0", () => {
  expect(() => { polinomio(-12, []); }).toThrow(RangeError);
});

test("argumento nao numeral", () => {
  expect(() => { polinomio("A", [1, 2, 3]); }).toThrow(TypeError);
});

test("argumento nao numeral", () => {
  expect(() => { polinomio(2, [null, 2, 3]); }).toThrow(TypeError);
});

test("argumento nao inteiro", () => {
  expect(() => { polinomio(2, [1.2, 2, 3]); }).toThrow(TypeError);
});
