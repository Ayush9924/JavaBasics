package com.lpu.OOps.arrays.one_d;

public class Searching {
    public static void main(String[] args) {

        int[] numsSorted = {1, 2, 3, 4};
        int target = 4;

        int i = 0, j = numsSorted.length - 1;
        int index = -1;

        while (i <= j) {//binary serching for mid div then search
            int mid = (i + j) / 2;

            if (target == numsSorted[mid]) {
                index = mid;
                break;
            } else if (target < numsSorted[mid]) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }

        System.out.println(index);
    }
}
