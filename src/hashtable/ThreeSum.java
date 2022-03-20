package hashtable;

import java.util.*;

/*给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有满足条件且不重复的三元组。

注意： 答案中不可以包含重复的三元组。

示例：

给定数组 nums = [-1, 0, 1, 2, -1, -4]，

满足要求的三元组集合为： [ [-1, 0, 1], [-1, -1, 2] ]*/
public class ThreeSum {
    public List<List<Integer>> threeSum(int arr[]) {
        Arrays.sort(arr);
        List<List<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>0) return lists;
            if (i>0&&arr[i]==arr[i-1]) continue;
            int left = i+1 , right = arr.length-1;
            while(left<right){
                if(arr[i]+arr[left]+arr[right]>0){
                    right--;
                }else if (arr[i]+arr[left]+arr[right]<0){
                    left++;
                }else {
                    lists.add(Arrays.asList(arr[i],arr[left],arr[right]));
                    while (right > left && arr[right] == arr[right - 1]) right--;
                    while (right > left && arr[left] == arr[left + 1]) left++;
                    right--;
                    left++;
                }
            }
        }
        return lists;
        }



}
