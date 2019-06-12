const crivoEratostenes = require("../src/crivoEratostenes");

test("argumento null/undefined", () => {
    expect(() => { crivoEratostenes(); }).toThrow();
});

test("argumento nao numerico", () => {
    expect(() => { crivoEratostenes("abcd", "2"); }).toThrow();
});

test("argumento de formato diferente", () => {
    expect(() => { crivoEratostenes("a", []); }).toThrow(TypeError);
});

test("argumento fora da faixa", () => {
    expect(() => { crivoEratostenes([], 1.1); }).toThrow();
    expect(() => { crivoEratostenes([1,3,5], 0); }).toThrow(RangeError);
});

test("numero primo", () => {
    expect(crivoEratostenes([5, 3, 1], 2)).toBe(true);
    expect(crivoEratostenes([0, 0, 0, 1, 2, 0, 5, 6], 5)).toBe(true);
});

test("numero nao primo", () => {
    expect(crivoEratostenes([9, 4, 6], 5)).toBe(false);
});



