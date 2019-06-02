const funcao = require("../algoritmos/cpf2");

test("CPF gerado satisfaz", () => {
    expect(funcao("54606451076")).toBe(true);
});

test("CPF inventado nao satisfaz", () => {
    expect(funcao("54606451071")).toBe(false);
});

test("argumento null/undefined", () => {
    expect(() => { funcao(); }).toThrow();
});

test("argumento nao numerico", () => {
    expect(() => { funcao("abcd"); }).toThrow();
});

test("valor maior que esperado", () => {
    expect(() => { funcao("1234567899999"); }).toThrow(RangeError);
});

test("deve ser string", () => {
    expect(() => funcao(54606451076)).toThrow(TypeError);
});