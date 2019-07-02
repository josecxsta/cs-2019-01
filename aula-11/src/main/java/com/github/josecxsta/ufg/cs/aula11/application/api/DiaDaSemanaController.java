/*
* Copyright (c) 2016.
* Fábrica de Software - Instituto de Informática (UFG)
* Creative Commons Attribution 4.0 International License.
*/

package com.github.josecxsta.ufg.cs.aula11.application.api;

import com.github.josecxsta.ufg.cs.aula11.domain.Calendario;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;

@RestController
public class DiaDaSemanaController {

    /**
     * Método principal da controller.
     * @param dataInicial Data inicial em 'dd-MM-yyy'
     * @param dataFinal Data final em 'dd-MM-yyy'
     * @return dias de diferença
     * @throws ParseException
     */
    @CrossOrigin
    @RequestMapping("ds")
    public int diaDaSemana(
    @RequestParam(value = "di", defaultValue = "não fornecida") String dataInicial,
    @RequestParam(value = "df", defaultValue = "não fornecida") String dataFinal)
    throws ParseException {
        return Calendario.diferencaEntreDatas(dataInicial, dataFinal);
    }
}
