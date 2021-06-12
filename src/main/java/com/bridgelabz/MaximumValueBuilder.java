package com.bridgelabz;

public class MaximumValueBuilder<E extends Comparable> {
    E firstValue;
    E secondValue;
    E thirdValue;

    public MaximumValueBuilder(E firstValue, E secondValue, E thirdValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.thirdValue = thirdValue;
    }

    public E findMax(){
        return MaximumValueBuilder.findMax(firstValue,secondValue,thirdValue);
    }

    public static <E extends Comparable> E findMax(E firstValue, E secondValue, E thirdValue) {
        E max = firstValue;
        if (secondValue.compareTo(max)>0)
            max = secondValue;
        if (thirdValue.compareTo(max)>0)
            max = thirdValue;
        return max;
    }

}
