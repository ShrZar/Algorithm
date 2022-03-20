package array;

import java.util.Arrays;

public class SearchFirstAndLast {
    /*给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。*/
    public static int[] method1(int arr[] , int target){
        int i = Arrays.binarySearch(arr , target);
        int left= i , right = i;
        if(i==-1) return new int[]{-1,-1};
        while(left-1>=0&&arr[left] == target) left--;
        while(right+1<arr.length&&arr[right] == target) right++;
        return new int[]{left , right};
    }

    private static int[] searchRange(int[] nums, int target) {
        int leftBorder = getLeftBorder(nums, target);
        int rightBorder = getRightBorder(nums, target);
        // 情况一
        if (leftBorder == -2 || rightBorder == -2) return new int[]{-1, -1};
        // 情况三
        if (rightBorder - leftBorder > 1) return new int[]{leftBorder + 1, rightBorder - 1};
        // 情况二
        return new int[]{-1, -1};
    }

    private  static int getLeftBorder(int[] nums, int target) {
        int left = 0 ,right = nums.length;
        int leftBorder = -2;
        while(left<=right){
            int mid = (left+right)>>1;
            if(nums[mid]>=target){
                right = mid -1 ;
                leftBorder =right;
            }else{
                left = mid +1;
            }
        }
        return  leftBorder;
    }

    private static int getRightBorder(int[] nums, int target) {
        int left = 0 ,right = nums.length;
        int rightBorder = -2;
        while(left<=right){
            int mid = (left+right)>>1;
            if(nums[mid]>target){
                right = mid -1 ;
            }else{
                left = mid +1;
                rightBorder = left;
            }
        }
        return  rightBorder;
    }





}
