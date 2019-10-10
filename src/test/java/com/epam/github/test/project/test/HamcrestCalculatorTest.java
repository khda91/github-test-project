package com.epam.github.test.project.test;

import com.epam.github.test.project.Calculator;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class HamcrestCalculatorTest {

    @Test
    public void sumTest() {
        Calculator calculator = new Calculator();
        int result = calculator.sum(4, 12);
        assertThat("Calculation was wrong", result, equalTo(16));
    }
}
