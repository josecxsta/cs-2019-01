const sorteio = require("../src/sorteio");

test("sorteio", () => {
    expect(typeof(sorteio())).toBe("object");
});