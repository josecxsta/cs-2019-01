const logaritmo = require("../algoritmos/logaritmo");

test("argumento null/undefined", () => {
  expect(() => { logaritmo(); }).toThrow();
});

test("argumento de formato diferente", () => {
  expect(() => { logaritmo("2", "1"); }).toThrow(TypeError);
});

test("argumento nao inteiro", () => {
  expect(() => { logaritmo(2.5, 1); }).toThrow(RangeError);
});

test("numero fora da faixa", () => {
  expect(() => { logaritmo(-1, 2); }).toThrow(RangeError);
});

test("valor real", () => {
  expect(logaritmo(10, 5)).toBe(83333337501727.66);
});
