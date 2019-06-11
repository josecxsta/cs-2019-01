const palavraMaisFrequente = require("../src/palavraMaisFrequente");

test("erro", () => {
    expect(() => palavraMaisFrequente(5)).toThrow();
});

test("mais frequente", () => {
    expect(palavraMaisFrequente("aula de cs aula")).toBe("aula");
});