const razaoAurea = require("../algoritmos/razaoAurea");

test("argumento null/undefined", () => {
  expect(() => { razaoAurea(); }).toThrow();
});

test("argumento de formato diferente", () => {
  expect(() => { razaoAurea("a", [], "2"); }).toThrow(TypeError);
});

test("argumento nao inteiro", () => {
  expect(() => { razaoAurea(10, 2.5, 2); }).toThrow(RangeError);
});
