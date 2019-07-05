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
public class NumeroController {

    /**
     *
     * @param numero
     * @return
     */
    @CrossOrigin
    @RequestMapping("ds")
    public String porExtenso(
    @RequestParam(value = "numero", defaultValue = "não fornecida")
    String numero) {
        int num = Integer.parseInt(numero);
        return Numero.porExtenso(num);
    }
}
