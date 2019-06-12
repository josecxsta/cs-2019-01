const quadradoPerfeito = require("../src/quadradoPerfeito");

test("argumento null/undefined", () => {
    expect(() => { quadradoPerfeito(); }).toThrow();
});

test("argumento nao numerico", () => {
    expect(() => { quadradoPerfeito("abcd"); }).toThrow();
});

test("argumento de formato diferente", () => {
    expect(() => { quadradoPerfeito("a"); }).toThrow(TypeError);
});

test("numero fora da faixa", () => {
    expect(() => quadradoPerfeito(-2)).toThrow(RangeError);
});

test("nao quadradoPerfeito", () => {
    expect(quadradoPerfeito(2)).toBe(false);
});

test("quadrado perfeito", () => {
    expect(quadradoPerfeito(9)).toBe(true);
});
