package array;

public class BinarySearch{
    public static int binarySearchMethod1(int nums[] , int target){
        if (target<nums[0]||target>nums[nums.length-1]){
            return -1;
        }
        int left = 0 ,right = nums.length-1;
        while(left<=right){
            int mid = (left + right)>>1;
            if(nums[mid]>target){
                right = mid - 1;
            }else if(nums[mid]<target){
                left = mid +1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    public static int binarySearchMethod2(int nums[] , int target){
        if (target<nums[0]||target>nums[nums.length-1]){
            return -1;
        }
        int left = 0 ,right = nums.length;
        while(left<right){
            int mid = (left + right)>>1;
            if(nums[mid]>target){
                right = mid;
            }else if(nums[mid]<target){
                left = mid +1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
