const fibonacci = require("../algoritmos/fibonacci");

test("argumento null/undefined", () => {
  expect(() => { fibonacci(); }).toThrow();
});

test("argumento nao numerico", () => {
  expect(() => { fibonacci("abcd"); }).toThrow();
});

test("argumento de formato diferente", () => {
  expect(() => { fibonacci("a"); }).toThrow(TypeError);
});

test("1 termo da sequencia", () => {
  expect(fibonacci(1)).toEqual(1);
});

test("3 termo da sequencia", () => {
  expect(fibonacci(3)).toEqual(2);
});

test("6 termo da sequencia", () => {
  expect(fibonacci(6)).toEqual(8);
});