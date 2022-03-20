package hashtable;

import java.util.HashSet;
import java.util.Set;

/*题意：给定两个数组，编写一个函数来计算它们的交集。*/
public class 两个数组的交集 {
    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1 == null || nums1.length == 0 || nums2 == null || nums2.length == 0) {
            return new int[0];
        }
        Set<Integer> a = new HashSet<Integer>();
        Set<Integer> result = new HashSet<Integer>();
        for (int i : nums1) {
            a.add(i);
        }
        for (int i : nums2) {
            if(a.contains(i)) result.contains(i);
        }

        int[] resultArr = new int[result.size()];
        int index = 0;
        for (int integer : result) {
            resultArr[index++] = integer;
        }
        return resultArr;
    }
}
