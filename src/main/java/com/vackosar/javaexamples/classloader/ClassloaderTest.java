package com.vackosar.javaexamples.classloader;

import org.junit.Assert;
import org.junit.Test;

public class ClassloaderTest {

    @Test
    public void loadClass() throws ClassNotFoundException {
        SimpleClassloader classLoader = new SimpleClassloader();
        classLoader.loadClass(ClassloaderTest.class.getCanonicalName());
        Assert.assertArrayEquals(new String [] {ClassloaderTest.class.getCanonicalName()}, classLoader.searchedClasses.toArray());
    }
}
