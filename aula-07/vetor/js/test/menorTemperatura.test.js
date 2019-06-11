const menorTemperatura = require("../src/menorTemperatura");

test("erro", () => {
    expect(() => menorTemperatura(5)).toThrow();
});

test("menor", () => {
    expect(menorTemperatura([15, 25, 3])).toBe(3);
});