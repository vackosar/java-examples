package com.vackosar.javaexamples.proxy;

public interface Printer {

    String run();

    static Printer create() {
        return new Impl();
    }

    class Impl implements Printer {
        public String run () {
            return "Printer acts.";
        }
    }
}
