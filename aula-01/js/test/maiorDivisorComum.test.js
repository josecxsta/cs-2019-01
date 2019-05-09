const maiorDivisorComum = require("../algoritmos/maiorDivisorComum");

test("12 e 6", () => {
  expect(maiorDivisorComum(12, 6)).toBe(6);
});

test("argumento null/undefined", () => {
  expect(() => { maiorDivisorComum(); }).toThrow();
});

test("argumento nao numerico", () => {
  expect(() => { maiorDivisorComum("abcd"); }).toThrow();
});

test("argumento de formato diferente", () => {
  expect(() => { maiorDivisorComum("a", "b"); }).toThrow(TypeError);
});

test("devem ser dois numerais", () => {
  expect(() => maiorDivisorComum(5)).toThrow(TypeError);
}); 