package com.HomeWork_1.tests;

import com.HomeWork_1.Calculator.Calculator;
import org.junit.Test;

public class CalculatorTests {
    public CalculatorTests() {
    }

    @Test
    public void canAddTwoNumbers() {
        Calculator calculator = new Calculator();
        int result = calculator.plus(1, 3);

        assert result == 4;
    }

    @Test
    public void IncorrectAddTwoNumbers() {
        Calculator calculator = new Calculator();
        int result = calculator.plus(1, 3);

        assert result != 5;
    }

    @Test
    public void canMinTwoNumbers() {
        Calculator calculator = new Calculator();
        int result = calculator.minus(6, 3);

        assert result == 3;
    }

    @Test
    public void canMultiplyTwoNumbers() {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(5, 2);

        assert result == 10;
    }

    @Test
    public void canDivideTwoNumbers() {
        Calculator calculator = new Calculator();
        int result = calculator.divide(8, 2);

        assert result == 4;
    }

    @Test
    public void canUseTwoMetods() {
        Calculator calculator = new Calculator();
        int result = calculator.plus(1, 3) - calculator.minus(6, 3);

        assert result == 1;
    }

    @Test
    public void canFewTwoMetodsWithMultiply() {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(5, 2) - calculator.minus(6, 3) * calculator.plus(1, 1);

        assert result == 4;
    }

    @Test
    public void canFewTwoMetodsWithDivide() {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(5, 2) - calculator.divide(12, 2) / calculator.plus(1, 1);

        assert result == 7;
    }

    @Test
    public void canFewTwoMetodsWithDivideAndMultiply() {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(5, 2) / calculator.plus(2, 3) * calculator.minus(6, 3);

        assert result == 6;
    }

    @Test
    public void IncorrectFewTwoMetodsWithDivideAndMultiply() {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(6, 2) / calculator.plus(3, 3) * calculator.minus(9, 3);

        assert result != 8 ;
    }
}
