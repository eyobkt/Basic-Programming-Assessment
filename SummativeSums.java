package com.sg.basicprogrammingconceptsassessment;

public class SummativeSums {
    public static void main(String[] args) {
        System.out.println("#1 Array Sum: " + add(new int[]{1, 90, -33, -55, 67, -16, 28, -55, 15}));
        System.out.println("#2 Array Sum: " + add(new int[]{999, -60, -77, 14, 160, 301}));
        System.out.println("#3 Array Sum: " + add(new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 
140, 150, 160, 170, 180, 190, 200, -99}));
    }
    
    public static int add(int[] intArr) {
        int sum = 0;
        
        for (int num : intArr) {
            sum += num;
        }
        
        return sum;
    }
}
