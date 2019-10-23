package com.epam.github.test.project.test;

import com.epam.github.test.project.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNgSoftAsserion {

    @Test
    public void testSoftAssertion() {
        Calculator calculator = new Calculator();
        SoftAssert softAssert = new SoftAssert();
        int res1 = calculator.sum(2, 3);
        softAssert.assertEquals(res1, 5);
        int res2 = calculator.multiply(res1, 4);
        softAssert.assertEquals(res2, 20);
        int res3 = calculator.sum(res2, 10);
        softAssert.assertEquals(res3, 30);
        softAssert.assertAll();
    }
}
