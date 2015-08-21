package com.vackosar.javaexamples.dozer;

import org.dozer.DozerBeanMapper;
import org.junit.Test;
import org.junit.Assert;

public class Dozer {

    @Test
    public void map() {
        final A alfa = new A("Alfa", 222L);
        final DozerBeanMapper dozerBeanMapper = new DozerBeanMapper();
        final B b = dozerBeanMapper.map(alfa, B.class);
        Assert.assertEquals(alfa.getName(), b.getName());
        Assert.assertEquals(alfa.getAccount(), b.getAccount());
    }

    @Test
    public void failToMapWithoutSetters() {
        final A alfa = new A("Alfa", 222L);
        final DozerBeanMapper dozerBeanMapper = new DozerBeanMapper();
        final C c = dozerBeanMapper.map(alfa, C.class);
        Assert.assertEquals(null, c.getName());
        Assert.assertEquals(null, c.getAccount());
    }
}
