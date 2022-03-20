package Sort;
import java.util.Arrays;

public class BubbleSort {
    private static void bubbleSort(int[] nums){
        for (int i = nums.length-1; i >0 ; i--) {
            boolean flag =true;
            for (int j = 0; j < i; j++) {
                if(nums[j]>nums[j+1]){
                    flag = false;
                    swap(nums,j,j+1);
                }
            }
            if(flag == true){
                break;
            }
        }
    }

    private static void swap(int[] nums , int i , int j){
        int t = nums[i];
        nums[i]=nums[j];
        nums[j]=t;
    }

    public static void main(String[] args) {
        int nums[] = {1,3,9,8,7,6,4};
        bubbleSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}

/*public class BubbleSort {

    private static void bubbleSort(int[] nums) {
        boolean hasChange = true;
        for (int i = 0, n = nums.length; i < n - 1 && hasChange; ++i) {
            hasChange = false;
            for (int j = 0; j < n - i - 1; ++j) {
                if (nums[j] > nums[j + 1]) {
                    swap(nums, j, j + 1);
                    hasChange = true;
                }
            }
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 7, 9, 5, 8};
        bubbleSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}*/

