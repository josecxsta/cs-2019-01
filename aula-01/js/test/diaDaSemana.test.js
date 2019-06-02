const diaDaSemana = require("../algoritmos/diaDaSemana");

test("argumento null/undefined", () => {
    expect(() => { diaDaSemana(); }).toThrow();
});

test("argumento de formato diferente", () => {
    expect(() => { diaDaSemana("2", "2", "1"); }).toThrow(TypeError);
});

test("argumento nao inteiro", () => {
    expect(() => { diaDaSemana(2.5, 2, 1990); }).toThrow(RangeError);
});

test("data invalida", () => {
    expect(() => { diaDaSemana(25, 20, 1990); }).toThrow(RangeError);
});

test("valor real", () => {
    expect(diaDaSemana(11, 5, 1750)).toBe(0);
});
