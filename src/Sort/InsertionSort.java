package Sort;


import java.util.Arrays;

public class InsertionSort {
    private static void insertionSort(int nums[]){
        for (int i = 1,j; i < nums.length; i++) {//j要放在第一轮循环定义，如果放在第二轮循环的话，nums[j+1]=nums[j]中j就是没有定义的
            int num = nums[i];
            for (j = i-1; j > 0 && nums[j] > num; j--) {
                nums[j+1]=nums[j];
            }
            nums[j+1]=num;
        }
    }

    private static void swap(int[] nums , int i , int j){
        int t = nums[i];
        nums[i]=nums[j];
        nums[j]=t;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 7, 9, 5, 8};
        insertionSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
