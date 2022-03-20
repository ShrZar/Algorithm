package hashtable;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int num[], int target){
        int[] res = new int[2];
        if(num==null&&num.length==0) return res;
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int i = 0; i < num.length; i++) {
            int temp = target-num[i];
            if(map.containsValue(temp)){
                res[0]=i;
                res[1]=map.get(temp);
                return res;
            }
            map.put(i,num[i]);
        }
        return res;


    }
}
