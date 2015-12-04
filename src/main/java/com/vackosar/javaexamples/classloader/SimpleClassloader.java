package com.vackosar.javaexamples.classloader;

import java.util.ArrayList;
import java.util.List;

public class SimpleClassloader extends ClassLoader {

    public List<String> searchedClasses = new ArrayList<>();

    @Override
    public Class<?> loadClass(String name) throws ClassNotFoundException {
        searchedClasses.add(name);
        return super.loadClass(name);
    }
}
