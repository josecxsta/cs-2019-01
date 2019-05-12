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