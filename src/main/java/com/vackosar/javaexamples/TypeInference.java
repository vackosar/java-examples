package com.vackosar.javaexamples;

import java.util.Collections;
import java.util.List;

/**
 *
 * Generics, type inference.
 *
 */
public class TypeInference {
    public static void main(String[] args) {
        // Add Type Witness to static method to infere type.
        List<String> strings = Collections.<String>emptyList();
    }
}