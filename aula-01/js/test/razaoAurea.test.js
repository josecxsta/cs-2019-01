const razaoAurea = require("../algoritmos/razaoAurea");

test("argumento null/undefined", () => {
    expect(() => { razaoAurea(); }).toThrow();
});

test("argumento de formato diferente", () => {
    expect(() => { razaoAurea("a", [], "2"); }).toThrow(TypeError);
});

test("argumento nao inteiro", () => {
  expect(() => { razaoAurea(10, 2.5, 2); }).toThrow(RangeError);
  expect(() => { razaoAurea(3, 5, 6.2); }).toThrow(RangeError);
});

test("razao aurea", () => {
  expect(razaoAurea(3, 5, 6)).toBe(1.6181818181818182);
});
