package com.bridgelabz;

import org.junit.Test;
import org.junit.Assert;

public class MaximumValueTest {
    @Test
    public void givenIntegerValue_whenCompared_returnsFirstValueAsMax()
    {
        MaximumValueBuilder maximumValue = new MaximumValueBuilder();
        int maxInteger = maximumValue.findMaximumValue(25, 15, 5);
        Assert.assertEquals(25,maxInteger);
    }
    @Test
    public void givenIntegerValue_whenCompared_returnsSecondValueAsMax()
    {
        MaximumValueBuilder maximumValue = new MaximumValueBuilder();
        int maxInteger = maximumValue.findMaximumValue(5, 15, 10);
        Assert.assertEquals(15,maxInteger);
    }
    @Test
    public void givenIntegerValue_whenCompared_returnsThirdValueAsMax()
    {
        MaximumValueBuilder maximumValue = new MaximumValueBuilder();
        int maxInteger = maximumValue.findMaximumValue(5, 10, 20);
        Assert.assertEquals(20,maxInteger);
    }
}
