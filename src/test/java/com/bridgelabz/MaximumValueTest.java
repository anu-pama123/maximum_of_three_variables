package com.bridgelabz;

import org.junit.Test;
import org.junit.Assert;

public class MaximumValueTest {

    @Test
    public void givenIntegerValue_whenCompared_returnsFirstValueAsMax()
    {
        MaximumValueBuilder maximumValue = new MaximumValueBuilder<Integer>(25, 15, 5);
        Comparable maxInteger = maximumValue.findMax();
        Assert.assertEquals(25,maxInteger);
    }
    @Test
    public void givenIntegerValue_whenCompared_returnsSecondValueAsMax()
    {
        MaximumValueBuilder maximumValue = new MaximumValueBuilder<Integer>(5, 15, 10);
        Comparable maxInteger = maximumValue.findMax();
        Assert.assertEquals(15,maxInteger);
    }
    @Test
    public void givenIntegerValue_whenCompared_returnsThirdValueAsMax()
    {
        MaximumValueBuilder maximumValue = new MaximumValueBuilder<Integer>(5, 15, 25);
        Comparable maxInteger = maximumValue.findMax();
        Assert.assertEquals(25,maxInteger);
    }
    @Test
    public void givenFloatValue_whenCompared_returnsFirstValueAsMax()
    {
        MaximumValueBuilder maximumValue = new MaximumValueBuilder<Float>(25.5f, 15.2f, 5.7f);
        Comparable maxFloat = maximumValue.findMax();
        Assert.assertEquals(25.5f,maxFloat);
    }
    @Test
    public void givenFloatValue_whenCompared_returnsSecondValueAsMax()
    {
        MaximumValueBuilder maximumValue = new MaximumValueBuilder<Float>(5.3f, 15.4f, 10.9f);
        Comparable maxFloat = maximumValue.findMax();
        Assert.assertEquals(15.4f,maxFloat);
    }
    @Test
    public void givenFloatValue_whenCompared_returnsThirdValueAsMax()
    {
        MaximumValueBuilder maximumValue = new MaximumValueBuilder<Float>(5.8f, 10.6f, 20.1f);
        Comparable maxFloat = maximumValue.findMax();
        Assert.assertEquals(20.1f,maxFloat);
    }
    @Test
    public void givenStringValue_whenCompared_returnsFirstValueAsMax()
    {
        MaximumValueBuilder maximumValue = new MaximumValueBuilder<String>("Orange", "Banana", "Apple");
        Comparable maxString = maximumValue.findMax();
        Assert.assertEquals("Orange", maxString);
    }
    @Test
    public void givenStringValue_whenCompared_returnsSecondValueAsMax()
    {
        MaximumValueBuilder maximumValue = new MaximumValueBuilder<String>("Banana", "Orange", "Apple");
        Comparable maxString = maximumValue.findMax();
        Assert.assertEquals("Orange", maxString);
    }
    @Test
    public void givenStringValue_whenCompared_returnsThirdValueAsMax()
    {
        MaximumValueBuilder maximumValue = new MaximumValueBuilder<String>("Apple", "Banana", "Orange");
        Comparable maxString = maximumValue.findMax();
        Assert.assertEquals("Orange", maxString);
    }

    @Test
    public void givenIntegerValues_WhenCompared_ReturnsMaxValue() {
        Integer maxInteger = new MaximumValueBuilder<>(20, 10, 5, 65, 2).findMax();
        Integer expectedMax = 65;
        Assert.assertEquals(expectedMax, maxInteger);
    }

    @Test
    public void givenFloatValues_WhenCompared_ReturnsMaxValue() {
        Float maxFloat = new MaximumValueBuilder<>(3.1f, 2.1f, 1.1f, 4.3f).findMax();
        Float expectedMax = 4.3f;
        Assert.assertEquals(expectedMax, maxFloat);
    }

    @Test
    public void givenStringValues_WhenCompared_ReturnsMaxValue() {
        String maxString = new MaximumValueBuilder<>("Peach", "Apple", "Banana", "yellow").findMax();
        Assert.assertEquals("yellow", maxString);
    }
}
