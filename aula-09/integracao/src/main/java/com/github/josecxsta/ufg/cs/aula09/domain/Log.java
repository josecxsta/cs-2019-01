package com.github.josecxsta.ufg.cs.aula09.domain;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


/**
 * Classe que implementa o Log4j.
 */
public final class Log {

    /**
     * Instância do Logger.
     */
    private static final Logger LOGGER = LogManager.getLogger("LOG");

    /**
     * Evita a instanciação.
     */
    private Log() {
    }

    /**
     * Faz log de informação de um texto.
     * @param texto texto que deve ser informado
     */
    public static void info(final String texto) {
        LOGGER.info(texto);
    }

}
