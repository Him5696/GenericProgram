package com.blz.generic;

public class MaximumProblem {
    public static void main(String[] args) {
        System.out.println("Welcome to generic Program");
        Integer a = 3, b = 8, c =7;
        testMaximum (a, b, c);
    }

    private static void testMaximum(Integer a, Integer b, Integer c) {
        Integer max = a;
        if(b.compareTo(a)>0){
            max = b;
        }
        if(c.compareTo(max)>0){
            max = c;
        }
        System.out.println("Maximum Number is: " + max);
    }
}
