const restoDivisaoInteira = require("../algoritmos/restoDivisaoInteira");

test("argumento null/undefined", () => {
  expect(() => { restoDivisaoInteira(); }).toThrow();
});

test("argumento de formato diferente", () => {
  expect(() => { restoDivisaoInteira("a", "2"); }).toThrow(TypeError);
});

test("argumento nao inteiro", () => {
  expect(() => { restoDivisaoInteira(2.5, 2); }).toThrow(RangeError);
});
