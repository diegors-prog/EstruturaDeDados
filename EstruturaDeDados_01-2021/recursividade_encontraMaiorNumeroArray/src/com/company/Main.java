package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList<Integer>();
        array.add(0, 10);
        array.add(1, 20);
        array.add(2, 50);
        array.add(3, 30);
        array.add(4, 40);

        int index = array.size();
        int result = encontrarMaior(array, index);
        System.out.println(result);
    }

    private static int encontrarMaior(ArrayList<Integer> arr, int i) {
        int m;
        if (i == 1) return arr.get(0);
        else {
            m = encontrarMaior(arr, i - 1);
            if (m > arr.get(i-1)) {
                return m;
            }else {
                return arr.get(i-1);
            }
        }
    }
}
