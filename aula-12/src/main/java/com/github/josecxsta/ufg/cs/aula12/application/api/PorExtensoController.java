/*
* Copyright (c) 2016.
* Fábrica de Software - Instituto de Informática (UFG)
* Creative Commons Attribution 4.0 International License.
*/

package com.github.josecxsta.ufg.cs.aula12.application.api;

import com.github.josecxsta.ufg.cs.aula12.domain.Numero;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PorExtensoController {

    /**
     * Retorna o número por extenso de determinado
     * número.
     * @param numero numero
     * @return numero por extenso
     */
    @CrossOrigin
    @RequestMapping("ds")
    public String numeroPorExtenso(
    @RequestParam(value = "num", defaultValue = "não fornecida")
    String numParam) {
        final int num = Integer.parseInt(numParam);
        return Numero.porExtenso(num);
    }
}
