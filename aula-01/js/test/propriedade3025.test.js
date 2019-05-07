const funcao = require("../algoritmos/propriedade3025");

test("3025 satisfaz (caso classico)", () => {
  expect(funcao(3025)).toBe(true);
});

test("3024 nao satisfaz", () => {
  expect(funcao(3024)).toBe(false);
});

test("argumento null/undefined", () => {
  expect(() => { funcao(); }).toThrow();
});

test("argumento nao numerico", () => {
  expect(() => { funcao("abcd"); }).toThrow();
});

test("valor negativo fora da faixa", () => {
  expect(() => { funcao(-1); }).toThrow(RangeError);
});

test("valor com mais de 4 digitos fora da faixa", () => {
  expect(() => funcao(10000)).toThrow(RangeError);
});

test("valor deve ser inteiro", () => {
  expect(() => funcao(10.3)).toThrow(RangeError);
}); 