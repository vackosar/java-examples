package com.vackosar.javaexamples;

import org.junit.Test;
import static org.junit.Assert.assertSame;

public class ObjectCloning {

    public static final String BETA = "Beta";
    public static final String GAMMA = "Gamma";

    static class A implements Cloneable {
        String string = "Alfa";

        public A(String string) {
            this.string = string;
        }

        public String getString() {
            return string;
        }

        public void setString(String string) {
            this.string = string;
        }

        @Override
        public A clone() {
            try {
                return (A) super.clone();
            } catch (CloneNotSupportedException e) {
                throw new RuntimeException(e);
            }
        }

        @Override
        public String toString() {
            return "A{" +
                    "string='" + string + '\'' +
                    '}';
        }
    }

    @Test
    public void cloneShouldHaveSameValues () {
        A beta = new A(BETA);
        A clone = beta.clone();
        assertSame(BETA, beta.getString());
        assertSame(BETA, clone.getString());

        clone.setString(GAMMA);
        assertSame(BETA, beta.getString());
        assertSame(GAMMA, clone.getString());
    }

}
