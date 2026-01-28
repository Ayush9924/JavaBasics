package com.lpu.questions;

public class BianrySearching {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int target = 5;

        int low = 0, high = arr.length-1;
        while(low<=high){
            int mid = (low + high)/2;

            if(arr[mid]==target){
                System.out.println(mid);
                return;
            }
            if (target < arr[mid]){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        System.out.println(-1);
    }
}