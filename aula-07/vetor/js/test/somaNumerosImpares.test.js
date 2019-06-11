const somaNUmerosImpares = require("../src/somaNUmerosImpares");

test("mais frequente", () => {
    expect(somaNUmerosImpares([5, 3, 2])).toBe(8);
});