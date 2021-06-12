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
    @Test
    public void givenFloatValue_whenCompared_returnsFirstValueAsMax()
    {
        MaximumValueBuilder maximumValue = new MaximumValueBuilder();
        float maxFloat = maximumValue.findMaximumFloatValue(25.5f, 15.2f, 5.7f);
        Assert.assertEquals(25.5f,maxFloat,0.0);
    }
    @Test
    public void givenFloatValue_whenCompared_returnsSecondValueAsMax()
    {
        MaximumValueBuilder maximumValue = new MaximumValueBuilder();
        float maxFloat = maximumValue.findMaximumFloatValue(5.3f, 15.4f, 10.9f);
        Assert.assertEquals(15.4f,maxFloat,0.0);
    }
    @Test
    public void givenFloatValue_whenCompared_returnsThirdValueAsMax()
    {
        MaximumValueBuilder maximumValue = new MaximumValueBuilder();
        float maxFloat = maximumValue.findMaximumFloatValue(5.8f, 10.6f, 20.1f);
        Assert.assertEquals(20.1f,maxFloat,0.0);
    }

    @Test
    public void givenStringValue_whenCompared_returnsFirstValueAsMax()
    {
        MaximumValueBuilder maximumValue = new MaximumValueBuilder();
        String maxString = maximumValue.findMaximumStringValue("Peach", "Apple", "Banana");
        Assert.assertEquals("Peach",maxString);
    }
    @Test
    public void givenStringValue_whenCompared_returnsSecondValueAsMax()
    {
        MaximumValueBuilder maximumValue = new MaximumValueBuilder();
        String maxString = maximumValue.findMaximumStringValue("Apple", "Peach", "Banana");
        Assert.assertEquals("Peach",maxString);
    }
    @Test
    public void givenStringValue_whenCompared_returnsThirdValueAsMax()
    {
        MaximumValueBuilder maximumValue = new MaximumValueBuilder();
        String maxString = maximumValue.findMaximumStringValue("Apple", "Banana", "Peach");
        Assert.assertEquals("Peach",maxString);
    }
}
