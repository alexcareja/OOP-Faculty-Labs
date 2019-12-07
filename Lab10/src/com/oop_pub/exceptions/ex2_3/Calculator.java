package com.oop_pub.exceptions.ex2_3;

import java.util.Collection;

public interface Calculator {
    class NullParameterException extends RuntimeException {
        public NullParameterException(String m) {
            super(m);
        }
    }

    class UnderflowException extends RuntimeException {
        public UnderflowException(String m) {
            super(m);
        }
    }

    class OverflowException extends RuntimeException {
        public OverflowException(String m) {
            super(m);
        }
    }

    Double add(Double nr1, Double nr2);

    Double divide(Double nr1, Double nr2);

    Double average(Collection<Double> numbers);
}
