package com.piotrglazar;

public class ExampleRunner {

    public static void main(String[] args) {
        patternMatching();
    }

    private static void patternMatching() {
        InstanceOfPatternMatching.whoIsIt(42);
        InstanceOfPatternMatching.whoIsIt("hello world");
        InstanceOfPatternMatching.whoIsIt('c');
    }
}
