package com.bridgelabz;

public class MaximumValueBuilder {

    public Integer findMaximumValue(Integer firstValue, Integer secondValue, Integer thirdValue) {
        Integer max = firstValue;
        if (secondValue.compareTo(max)>0)
            max = secondValue;
        if (thirdValue.compareTo(max)>0)
            max = thirdValue;
        return max;
    }

    public Float findMaximumFloatValue(Float firstValue, Float secondValue, Float thirdValue) {
        Float max = firstValue;
        if (secondValue.compareTo(max)>0)
            max = secondValue;
        if (thirdValue.compareTo(max)>0)
            max = thirdValue;
        return max;
    }

    public String findMaximumStringValue(String firstValue, String secondValue, String thirdValue) {
        String max = firstValue;
        if (secondValue.compareTo(max)>0)
            max = secondValue;
        if (thirdValue.compareTo(max)>0)
            max = thirdValue;
        return max;
    }
}
