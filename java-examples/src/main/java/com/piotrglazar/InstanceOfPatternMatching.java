package com.piotrglazar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.invoke.MethodHandles;

public class InstanceOfPatternMatching {

    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    public static void whoIsIt(Object o) {
        if (o instanceof Integer i) {
            LOGGER.info("I'm an integer {}", i);
        } else if (o instanceof String s) {
            LOGGER.info("I'm a string {}", s);
        } else {
            LOGGER.info("Unknown argument {}", o);
        }
    }
}
