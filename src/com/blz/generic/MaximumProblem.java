package com.blz.generic;

public class MaximumProblem<T extends Comparable> {
    //Instance Variable
    T x, y, z;

    //constructor
    public MaximumProblem(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to generic Program");

        new MaximumProblem<Integer>(3, 6, 7).print();
        new MaximumProblem<Float>(2.3f, 7.8f, 6.7f).print();
        new MaximumProblem<String>("Apple", "Peach", "Banana").print();
    }

    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x;
        if (y.compareTo(max) > 0)
            max = y;
        if (z.compareTo(max) > 0)
            max = z;

        System.out.println("Maximum Number : " + max);
        return max;
    }

    public void print() {
        maximum(x, y, z);
    }
}
