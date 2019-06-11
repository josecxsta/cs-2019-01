const comparaVetores = require("../src/comparaVetores");

test("compara", () => {
    expect(comparaVetores([1], [1, 2, 3])).toStrictEqual([1]);
});