package com.bridgelabz;

import org.junit.Test;
import org.junit.Assert;

public class MaximumValueTest {

    @Test
    public void givenIntegerValue_whenCompared_returnsFirstValueAsMax() {
        MaximumValueBuilder maximumValue = new MaximumValueBuilder();
        Comparable maxInteger = maximumValue.findMax(25,15,20);
        Comparable expectedResult=25;
        Assert.assertEquals(expectedResult,maxInteger);
    }

    @Test
    public void givenIntegerValue_whenCompared_returnsSecondValueAsMax() {
        MaximumValueBuilder maximumValue = new MaximumValueBuilder();
        Comparable maxInteger = maximumValue.findMax(15,25,20);
        Comparable expectedResult=25;
        Assert.assertEquals(expectedResult,maxInteger);
    }

    @Test
    public void givenIntegerValue_whenCompared_returnsThirdValueAsMax() {
        MaximumValueBuilder maximumValue = new MaximumValueBuilder();
        Comparable maxInteger = maximumValue.findMax(15,20,25);
        Comparable expectedResult=25;
        Assert.assertEquals(expectedResult,maxInteger);
    }

    @Test
    public void givenFloatValue_whenCompared_returnsFirstValueAsMax() {
        MaximumValueBuilder maximumValue = new MaximumValueBuilder();
        Comparable maxInteger = maximumValue.findMax(3.1f,2.3f,2.5f);
        Comparable expectedResult=3.1f;
        Assert.assertEquals(expectedResult,maxInteger);
    }

    @Test
    public void givenFloatValue_whenCompared_returnsSecondValueAsMax() {
        MaximumValueBuilder maximumValue = new MaximumValueBuilder();
        Comparable maxInteger = maximumValue.findMax(1.3f,4.2f,2.5f);
        Comparable expectedResult=4.2f;
        Assert.assertEquals(expectedResult,maxInteger);
    }

    @Test
    public void givenFloatValue_whenCompared_returnsThirdValueAsMax() {
        MaximumValueBuilder maximumValue = new MaximumValueBuilder();
        Comparable maxInteger = maximumValue.findMax(1.8f,2.6f,3.5f);
        Comparable expectedResult=3.5f;
        Assert.assertEquals(expectedResult,maxInteger);
    }

    @Test
    public void givenStringValue_whenCompared_returnsFirstValueAsMax() {
        MaximumValueBuilder maximumValue = new MaximumValueBuilder();
        Comparable maxInteger = maximumValue.findMax("Peach","Apple","Banana");
        Comparable expectedResult="Peach";
        Assert.assertEquals(expectedResult,maxInteger);
    }

    @Test
    public void givenStringValue_whenCompared_returnsSecondValueAsMax() {
        MaximumValueBuilder maximumValue = new MaximumValueBuilder();
        Comparable maxInteger = maximumValue.findMax("Apple","Peach","Banana");
        Comparable expectedResult="Peach";
        Assert.assertEquals(expectedResult,maxInteger);
    }
    @Test
    public void givenStringValue_whenCompared_returnsThirdValueAsMax() {
        MaximumValueBuilder maximumValue = new MaximumValueBuilder();
        Comparable maxInteger = maximumValue.findMax("Apple","Banana","Peach");
        Comparable expectedResult="Peach";
        Assert.assertEquals(expectedResult,maxInteger);
    }
}
