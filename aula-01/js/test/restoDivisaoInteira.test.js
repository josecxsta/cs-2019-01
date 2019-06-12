const restoDivisaoInteira = require("../src/restoDivisaoInteira");

test("argumento null/undefined", () => {
    expect(() => { restoDivisaoInteira(); }).toThrow();
});

test("argumento de formato diferente", () => {
    expect(() => { restoDivisaoInteira("a", "2"); }).toThrow(TypeError);
});

test("argumento nao inteiro", () => {
    expect(() => { restoDivisaoInteira(2.5, 2); }).toThrow(RangeError);
});

test("argumento menor que zero", () => {
    expect(() => { restoDivisaoInteira(-1, 2); }).toThrow(RangeError);
});

test("resto", () => {
    expect(restoDivisaoInteira(20, 3)).toBe(2);
});

test("resto 2", () => {
    expect(restoDivisaoInteira(100, 5)).toBe(0);
});
