package array;

import java.util.Arrays;
/*给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。*/

public class SquareOfOrderedArray {
    /*暴力解法*/
    public static int[] method1(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            arr[i]*=arr[i];
        }
        Arrays.sort(arr);
        return arr;
    }
/*双指针法*/
    /*因为比较的是最大值所以应该从数组的最后一位数开始向后记录*/
/*    public static int[] method2(int arr[]){
        int right = arr.length-1;
        int left = 0;
        int[] nums = new int[arr.length];
        int a = 0;
        while(left<=right){
            if(arr[left]*arr[left]>arr[right]*arr[right]){
                nums[a++]=arr[right]*arr[right];
                right--;
            }else{
                nums[a++]=arr[left]*arr[left];
                left++;
            }
        }
        return nums;
    }*/

    public static int[] sortedSquares(int[] nums) {
        int right = nums.length - 1;
        int left = 0;
        int[] result = new int[nums.length];
        int index = result.length - 1;
        while (left <= right) {
            if (nums[left] * nums[left] > nums[right] * nums[right]) {
                result[index--] = nums[left] * nums[left];
                ++left;
            } else {
                result[index--] = nums[right] * nums[right];
                --right;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int nums[] = {-7,-3,2,3,11};
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }
}

