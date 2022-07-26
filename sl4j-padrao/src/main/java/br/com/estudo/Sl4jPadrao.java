package br.com.estudo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Sl4jPadrao {
    private static final Logger LOGGER = LoggerFactory.getLogger(Sl4jPadrao.class);
    public static void main(String[] args) {
        LOGGER.info("Sl4j padrão");
    }
}
