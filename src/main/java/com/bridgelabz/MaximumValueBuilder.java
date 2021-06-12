package com.bridgelabz;

public class MaximumValueBuilder {

    public <E extends Comparable> E findMax(E firstValue, E secondValue, E thirdValue) {
        E max =firstValue;
        if (secondValue.compareTo(max)>0)
            max = secondValue;
        if (thirdValue.compareTo(max)>0)
            max = thirdValue;
        return max;
    }
}
