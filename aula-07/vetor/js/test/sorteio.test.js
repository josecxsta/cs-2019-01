const sorteio = require("../src/sorteio");

test("erro", () => {
    expect(() => { sorteio() }).toBe(1);
});