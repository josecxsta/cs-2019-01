const menorTemperatura = require("../src/menorTemperatura");

test("menor", () => {
    expect(menorTemperatura([15, 25, 3])).toBe(3);
});