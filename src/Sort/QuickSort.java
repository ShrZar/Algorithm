package Sort;

public class QuickSort {
    private static void quickSort(int nums[] , int left , int right){
        if(left>=right){
            return;
        }
        int i = left - 1;
        int j = right + 1;
        int x = nums[left];
        while(i<j){
            while(nums[++i]<x);
            while(nums[--j]>x);
            if(i<j){
                swap(nums,i,j);
            }
        }
        quickSort(nums,left,j);
        quickSort(nums,j+1,right);
    }

    private static void swap(int[] nums , int i ,int j ){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

}
