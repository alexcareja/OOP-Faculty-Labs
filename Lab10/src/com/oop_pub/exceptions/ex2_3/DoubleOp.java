package com.oop_pub.exceptions.ex2_3;

import java.util.Collection;

public class DoubleOp implements Calculator {
    @Override
    public Double add(Double nr1, Double nr2) throws
            NullParameterException, OverflowException, UnderflowException {
        if(nr1 == null || nr2 == null) {
            throw new NullParameterException("Parametru null");
        }
        if(nr1 + nr2 > Double.MAX_VALUE) {
            throw new OverflowException("She wasn't ready");
        }
        if(nr1 + nr2 < (-Double.MAX_VALUE)) {
            throw new UnderflowException("Oh NO!");
        }
        return nr1 + nr2;
    }

    @Override
    public Double divide(Double nr1, Double nr2) throws NullParameterException{
        if(nr1 == null || nr2 == null) {
            throw new NullParameterException("Parametru null");
        }
        return nr1/nr2;
    }

    @Override
    public Double average(Collection<Double> numbers) throws
            NullParameterException, OverflowException, UnderflowException{
        if(numbers == null) {
            throw new NullParameterException("Parametru null");
        }
        double sum = 0;
        for(Double n : numbers) {
            if(sum + n > Double.MAX_VALUE) {
                throw new OverflowException("She wasn't ready");
            }
            if(sum  + n < (-Double.MAX_VALUE)) {
                throw new UnderflowException("Oh NO!");
            }
            sum += n;
        }
        return sum / (numbers.size() + 1);
    }
}
