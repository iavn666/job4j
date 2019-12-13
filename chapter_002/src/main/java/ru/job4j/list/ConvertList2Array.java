package ru.job4j.list;

import java.util.*;

public class ConvertList2Array {
    public static int[][] toArray(List<Integer> list, int cells) {
        int groups = (int) Math.ceil((double) list.size() / cells);
        int[][] array = new int[groups][cells];
        int row = 0, cell = 0;
        for (Integer num: list) {
            if(cell<cells) {
                array[row][cell++] = num;
            } else{
                cell=0;
                ++row;
                array[row][cell++] = num;
            }

            }



        return array;

    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3,4,5,6,7);
        int[][] rsl = toArray(list, 3);
        for (int[] row : rsl) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}