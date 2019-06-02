const raizQuadrada = require("../algoritmos/raizQuadrada");

test("argumento null/undefined", () => {
  expect(() => { raizQuadrada(); }).toThrow();
});

test("argumento de formato diferente", () => {
  expect(() => { raizQuadrada("a", "2"); }).toThrow(TypeError);
});

test("argumento nao inteiro", () => {
  expect(() => { raizQuadrada(10, 5.5); }).toThrow(RangeError);
});

test("argumento fora da faixa", () => {
  expect(() => { raizQuadrada(-1, 5); }).toThrow(RangeError);
});

test("raiz quadrada", () => {
  expect(raizQuadrada(9, 10)).toBe(3);
});
