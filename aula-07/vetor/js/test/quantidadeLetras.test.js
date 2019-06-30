const quantidadeLetras = require("../src/quantidadeLetras");

test("erro", () => {
    expect(() => { quantidadeLetras(1); }).toThrow();
});

test("software-construction", () => {
    const response = [];
    response["s"] = 2;
    response["o"] = 3;
    response["f"] = 1;
    response["t"] = 3;
    response["w"] = 1;
    response["a"] = 1;
    response["r"] = 2;
    response["e"] = 1;
    response["c"] = 2;
    response["n"] = 2;
    response["u"] = 1;
    response["i"] = 1;
    expect(quantidadeLetras("software-construction")).toStrictEqual(response);
});