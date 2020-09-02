package com.Practice;

public class DegreesPractice {
    public static void main(String args[]) {
        double x = 45.0;
        double y = 30.0;
        double[] nums = {1.4, 1.5, 1.6, -1.4, -1.5, -1.6};
        for (double num : nums) {
            test(num);
        }
        System.out.println(Math.toDegrees(x));
        System.out.println(Math.toDegrees(y));
    }
    private static void test(double num){
        System.out.print("Math.floor("+num+")"+Math.floor(num)+"\n");
        System.out.print("Math.round("+num+")"+Math.round(num)+"\n");
        System.out.print("Math.ceil("+num+")"+Math.ceil(num)+"\n");
    }
}

