package com.bridgelabz;

import java.util.Arrays;

public class MaximumValueBuilder<E extends Comparable> {
    E firstValue;
    E secondValue;
    E thirdValue;
    E[] optionalValues;

    public MaximumValueBuilder(E firstValue, E secondValue, E thirdValue, E... optionalValues) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.thirdValue = thirdValue;
        this.optionalValues = optionalValues;
    }

    public E findMax() {
        return MaximumValueBuilder.findMax(firstValue, secondValue, thirdValue, optionalValues);
    }

    public static <E extends Comparable> E findMax(E firstValue, E secondValue, E thirdValue, E... optionalValues) {
        Integer[] optionalIntValues = {20, 15, 2, 6};
        Float[] optionalFloatValues = {9.5f, 3.2f, 0.6f};
        String[] optionalStringValues = {"anu", "banana", "zebra"};
        E max = firstValue;
        if (secondValue.compareTo(max) > 0)
            max = secondValue;
        if (thirdValue.compareTo(max) > 0)
            max = thirdValue;
        if (optionalValues.length > 0) {
            Arrays.sort(optionalValues);
            if (optionalValues[optionalValues.length - 1].compareTo(max) > 0)
                max = optionalValues[optionalValues.length - 1];
        }
        printMax(firstValue, secondValue, thirdValue, max, optionalValues);
        return max;
    }

    public static <E extends Comparable> void printMax(E firstValue, E secondValue, E thirdValue, E max, E... optionalVal) {
        System.out.print("Maximum of " + firstValue + "," + secondValue + "," + thirdValue + ",");
        for (E value : optionalVal) {
            System.out.print(value + ",");
        }
        System.out.println("is:" + max);
    }
}
