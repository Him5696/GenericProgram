package com.blz.generic;

public class MaximumProblem {

    public static void main(String[] args) {
        System.out.println("Welcome to generic Program");
        MaximumProblem maximumVal = new MaximumProblem();
        maximumVal.maximum(3, 6, 7);
        maximumVal.maximum(2.3f, 7.8f, 6.7f);
        maximumVal.maximum("Apple", "Peach", "Banana");
    }
    public static <T extends Comparable<T>> T maximum(T x, T y, T z){
        T max = x;
        if(y.compareTo(max) > 0)
            max = y;
        if(z.compareTo(max) > 0)
            max = z;

        System.out.println("Maximum Number : " + max);
        return max;
    }
}
