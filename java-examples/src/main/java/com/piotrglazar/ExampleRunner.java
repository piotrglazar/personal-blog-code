package com.piotrglazar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.invoke.MethodHandles;

public class ExampleRunner {

    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    public static void main(String[] args) {
        patternMatching();
        ranges();
    }

    private static void patternMatching() {
        InstanceOfPatternMatching.whoIsIt(42);
        InstanceOfPatternMatching.whoIsIt("hello world");
        InstanceOfPatternMatching.whoIsIt('c');
    }

    private static void ranges() {
        Range valid = new Range(0, 10);
        LOGGER.info("Range has boundaries {} {}", valid.low(), valid.high());
        try {
            new Range(10, 0);
        } catch (InvalidRangeBoundariesException e) {
            LOGGER.info(e.getMessage());
        }
    }
}
