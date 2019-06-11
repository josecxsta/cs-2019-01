const palavraMaisFrequente = require("../src/palavraMaisFrequente");

test("mais frequente", () => {
    expect(palavraMaisFrequente("aula de cs aula")).toBe("aula");
});