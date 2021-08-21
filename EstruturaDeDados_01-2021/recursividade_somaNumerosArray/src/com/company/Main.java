package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        int index = 0;
        ArrayList<Integer> array = new ArrayList<Integer>();
        array.add(0, 10);
        array.add(1, 20);
        array.add(2, 30);
        array.add(3, 40);

        int result = somaArray(array, index);
        System.out.println(result);
    }

    private static int somaArray(ArrayList<Integer> arr, int i) {
        if (i < arr.size()) {
            return arr.get(i) + somaArray(arr, i + 1);
        }else return 0;
    }
}
