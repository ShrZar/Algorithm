package hashtable;

import java.util.HashMap;
import java.util.Map;

public class fourSum {
    public int sum(int[] a ,int[] b,int[] c,int[] d) {
        Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        int res = 0;
        int temp;
        for (int i : a) {
            for (int j : b) {
                temp = i+j;
                if (hashMap.containsKey(temp)){
                    hashMap.put(temp,hashMap.get(temp)+1);
                }else hashMap.put(temp,1);
            }
        }

        for (int i : c) {
            for (int j : d) {
                temp = i+j;
                if (hashMap.containsKey(0-temp)){
                    res=res+hashMap.get(0-temp);
                }
            }
        }
        return res;
    }
}
