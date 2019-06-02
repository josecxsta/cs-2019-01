const potenciaSomas = require("../algoritmos/potenciaSomas");

test("argumento null/undefined", () => {
    expect(() => { potenciaSomas(); }).toThrow();
});

test("argumento nao numerico", () => {
    expect(() => { potenciaSomas("abcd", "2"); }).toThrow();
});

test("argumento de formato diferente", () => {
    expect(() => { potenciaSomas("a", []); }).toThrow(TypeError);
});

test("argumento fora da faixa", () => {
    expect(() => { potenciaSomas([], 1.1); }).toThrow();
    expect(() => { potenciaSomas(-1, 0); }).toThrow(RangeError);
});

test("3", () => {
    expect(potenciaSomas(3, 2)).toBe(9);
});

