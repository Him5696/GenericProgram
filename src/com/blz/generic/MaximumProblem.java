package com.blz.generic;

public class MaximumProblem {
    public static void main(String[] args) {
        System.out.println("Welcome to generic Program");
        Integer a = 3, b = 6, c = 7;
        Float x = 2.3f, y = 7.8f, z = 6.7f;
        String l = "Apple", m = "Banana", n = "Peach";
        testMaximum(a, b, c);
        getMaximum(x, y, z);
        getMaximum(l, m, n);
    }

    private static void getMaximum(String l, String m, String n) {
        String max = l;
        if (m.compareTo(l) > 0) {
            max = m;
        }
        if (n.compareTo(max) > 0) {
            max = n;
        }
        System.out.println("Maximum Number of String is::" + max);
    }

    private static void getMaximum(Float x, Float y, Float z) {
        Float max = x;
        if (y.compareTo(x) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        System.out.println("Maximum Number of Float Value is: " + max);
    }

    private static void testMaximum(Integer a, Integer b, Integer c) {
        Integer max = a;
        if (b.compareTo(a) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        System.out.println("Maximum Number is: " + max);
    }
}
