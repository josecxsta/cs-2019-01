const quadradoPerfeito = require("../algoritmos/quadradoPerfeito");

test("argumento null/undefined", () => {
  expect(() => { quadradoPerfeito(); }).toThrow();
});

test("argumento nao numerico", () => {
  expect(() => { quadradoPerfeito("abcd"); }).toThrow();
});

test("argumento de formato diferente", () => {
  expect(() => { quadradoPerfeito("a"); }).toThrow(TypeError);
});

test("numero fora da faixa", () => {
  expect(() => quadradoPerfeito(-2)).toThrow(RangeError);
});

