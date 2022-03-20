package Sort;

import java.util.Arrays;

public class SelectionSort {
    private static void selectSort(int[] nums){
        for (int i = 0; i < nums.length-1; i++) {
            int minIndex = i;
            for (int j = i;  j < nums.length; j++) {
                if(nums[minIndex]>nums[j]){
                    minIndex = j;
                }
            }
            swap(nums,minIndex,i);
        }
    }

    private static void swap(int[] nums , int i ,int j ){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 7, 9, 5, 8};
        selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }
/*    private static void selectionSort(int[] nums) {
        for (int i = 0, n = nums.length; i < n - 1; ++i) {
            int minIndex = i;
            for (int j = i; j < n; ++j) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }
            swap(nums, minIndex, i);
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 7, 9, 5, 8};
        selectionSort(nums);
        System.out.println(Arrays.toString(nums));
    }*/

}
