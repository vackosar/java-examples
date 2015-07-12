package com.vackosar.javaexamples;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CollectionToString {
    @Test
    public void listShouldBeWrittenToString() {
        List<String> list = Arrays.asList("alfa", "beta", "gamma");
        assertEquals("[alfa, beta, gamma]", Arrays.toString(list.toArray()));
    }
}
