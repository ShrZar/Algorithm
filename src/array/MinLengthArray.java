package array;

public class MinLengthArray {
    /*给定一个含有 n 个正整数的数组和一个正整数 s ，找出该数组中满足其和 ≥ s 的长度最小的 连续 子数组，并返回其长度。如果不存在符合条件的子数组，返回 0。
    示例：
    输入：s = 7, nums = [2,3,1,2,4,3] 输出：2 解释：子数组 [4,3] 是该条件下的长度最小的子数组。*/

    /*暴力解法*/
    public static int method1(int[] arr , int s){
        int min = arr.length+1;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum = sum + arr[j];
                if(sum>=s){
                    int length = j-i+1;
                    min=min>length?length:min;
                    break;
                }
            }
        }
        return min< arr.length+1?min:0;
    }

    /*滑动窗口*/
    public static int method2(int[] arr , int s){
        int minLength = arr.length+1;
        int sum = 0;
        int left = 0;
        for (int right = 0; right < arr.length; right++) {
            sum+=arr[right];
            while(sum>=s){
                minLength=Math.min(minLength,right-left+1);
                sum-=arr[left++];
            }
        }
        return minLength<= arr.length?minLength:0;
    }

    public static void main(String[] args) {
        int nums[] = {2,3,1,2,4,3};
        System.out.println(method1(nums,11));
        System.out.println(method2(nums,11));

    }
}
