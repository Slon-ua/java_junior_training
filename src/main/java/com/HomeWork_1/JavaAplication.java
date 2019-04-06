package com.HomeWork_1;

import com.HomeWork_1.Calculator.Calculator;

public class JavaAplication {
    public JavaAplication() {
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Calculator.Somth();

        int result = calculator.plus(1, 1);
        System.out.println("result = " + result);

        int result_min = calculator.minus(5, 2);
        System.out.println("result_min = " + result_min);

        int result_multiply = calculator.multiply(5, 2);
        System.out.println("result_multiply = " + result_multiply);

        int result_divide = calculator.divide(8, 2);
        System.out.println("result_divide = " + result_divide);

        int twoMetod = result - result_min;

        System.out.println("args = [" + (result - result_min) + "]");
        System.out.println("Use two metods = " + (result - result_min));
        System.out.println("Use few metods = " + (result_multiply - result_min * result));
        System.out.println("Use few metods = " + (result_multiply - result_divide / result));
    }
}
