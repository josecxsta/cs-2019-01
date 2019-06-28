package com.github.josecxsta.ufg.cs.aula09.domain;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


/**
*
*/
public class Log {

    private static final Logger logger = LogManager.getLogger("Logger");

    /**
     *
     */
    public static void info(String texto) {
        logger.info(texto);
    }

}
