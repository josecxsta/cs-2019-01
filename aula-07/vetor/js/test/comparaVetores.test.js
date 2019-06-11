const comparaVetores = require("../src/comparaVetores");

test("erro", () => {
    expect(() => comparaVetores(5, 3)).toThrow();
});

test("compara", () => {
    expect(comparaVetores([1], [1, 2, 3])).toStrictEqual([1]);
});
