const somaNumerosImpares = require("../src/somaNumerosImpares");

test("erro", () => {
    expect(() => somaNumerosImpares(5)).toThrow();
});

test("mais frequente", () => {
    expect(somaNumerosImpares([5, 3, 2])).toBe(8);
});