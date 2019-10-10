package com.epam.github.test.project.test;

import com.epam.github.test.project.Calculator;
import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AssertJCalculatorTest {

    @Test
    public void sumTest() {
        Calculator calculator = new Calculator();
        int result = calculator.sum(10, 20);
        assertThat(result).as("Calculation was wrong").isEqualTo(30);
    }
}