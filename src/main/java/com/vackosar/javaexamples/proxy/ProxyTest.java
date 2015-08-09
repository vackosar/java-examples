package com.vackosar.javaexamples.proxy;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Proxy;

public class ProxyTest {

    @Test
    public void proxyPrintCall() {
        final Printer printer = Printer.create();
        final Printer printerProxy = (Printer) LoggingProxy.create(printer);
        Assert.assertEquals("Printer acts.", printerProxy.run());
        Assert.assertEquals("Executing method: run", ((LoggingProxy) Proxy.getInvocationHandler(printerProxy)).getProxyMessage());
    }

    @Test(expected = ClassCastException.class)
    public void failCastingProxingInterfaceLessClass() {
        final InterfacelessPrinter interfacelessPrinter = new InterfacelessPrinter();
        final InterfacelessPrinter interfacelessPrinterProxy = (InterfacelessPrinter) LoggingProxy.create(interfacelessPrinter);
    }
}
