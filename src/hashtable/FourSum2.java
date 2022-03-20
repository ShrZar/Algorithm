package hashtable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum2 {
    public List<List<Integer>> fourSum2(int arr[],int target){
        List<List<Integer>> result = new ArrayList<>();
        if(arr==null&&arr.length<=3) return result;
        Arrays.sort(arr);
        int length = arr.length;
        for (int i = 0; i < arr.length-3; i++) {
            if(i>0&&arr[i]==arr[i-1]) continue;
            if ((long) arr[i] + arr[i + 1] + arr[i + 2] + arr[i + 3] > target) {
                break;
            }
            if ((long) arr[i] + arr[length - 3] + arr[length - 2] + arr[length - 1] < target) {
                continue;
            }
            for (int j = i+1; j < arr.length-2; j++) {
                if(j>0&&arr[j]==arr[j-1]) continue;
                if ((long) arr[j] + arr[j + 1] + arr[j + 2] + arr[j + 3] > target) {
                    break;
                }
                if ((long) arr[j] + arr[length - 3] + arr[length - 2] + arr[length - 1] < target) {
                    continue;
                }
                int left = j+1 , right = arr.length-1;
                while (left<right){
                    int sum = arr[i]+arr[j]+arr[left]+arr[right];
                    if (sum>target){
                        right--;
                    }else if (sum<target){
                        left++;
                    }else {
                        result.add(Arrays.asList(arr[i],arr[j],arr[left],arr[right]));
                        while(left<right&&arr[left]==arr[left+1]) left++;
                        while(left<right&&arr[right]==arr[right-1]) right--;
                        left++;
                        right--;
                    }
                }

            }

        }
        return result;

    }

}
