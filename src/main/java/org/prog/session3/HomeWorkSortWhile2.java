package org.prog.session3;

public class HomeWorkSortWhile2 {
    public static void main(String[] args) {
        int i = 0;
        int[] array = new int[]{
                4,
                2,
                7,
                8,
                10,
                1,
                9
        };

        while (i < array.length) {
            if (i != 0 && array[i] < array[i - 1]) {
                int current = array[i];
                array[i] = array[i - 1];
                array[i - 1] = current;
                i--;
            } else {
                i++;
            }
        }

        for (int j = 0; j < array.length; j++) {
            System.out.printf(array[j] + " ");
        }
    }
}


