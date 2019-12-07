package com.oop_pub.exceptions.ex2_3;

import java.util.ArrayList;
import java.util.List;

public class MainEx2 {
    public static void main(String[] args) {
        // TODO: Initialize the calculator
        Calculator calculator = new DoubleOp();



        System.out.println(calculator.add(2d, 3d));
        System.out.println(calculator.divide(9d, 4d));
        System.out.println(calculator.average(List.of(1d, 2d, 3d, 4d)));

        // TODO: Test edge cases that would throw exceptions

        //System.out.println(calculator.add(null, 1d));
        System.out.println(calculator.add(Double.MAX_VALUE, Double.MAX_VALUE));
        //System.out.println(calculator.add((-Double.MAX_VALUE), (-Double.MAX_VALUE)));
        //System.out.println(calculator.divide(null, 9d));
        List<Double> d = new ArrayList<>();
        d.add(Double.MAX_VALUE);
        d.add(Double.MAX_VALUE);
        System.out.println(calculator.average(d));
    }
}
