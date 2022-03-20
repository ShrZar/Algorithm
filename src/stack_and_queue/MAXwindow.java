package stack_and_queue;

import java.util.Deque;
import java.util.LinkedList;
/*给定一个数组 nums，有一个大小为 k 的滑动窗口从数组的最左侧移动到数组的最右侧。你只可以看到在滑动窗口内的 k 个数字。滑动窗口每次只向右移动一位。

返回滑动窗口中的最大值。*/
public class MAXwindow {

        public int[] maxSlidingWindow(int[] nums, int k) {
            int[] res = new int[nums.length - k + 1];
            Deque<Integer> deque = new LinkedList<>();
            for (int i = 0; i < nums.length; i++) {
                while (!deque.isEmpty() && deque.peekLast() < nums[i]) {//注意：此处是小于号
                    deque.removeLast();
                }
                deque.addLast(nums[i]);
                if (i >= k && nums[i - k] == deque.peekFirst()) {
                    deque.removeFirst();
                }
                if (i >= k - 1) {
                    res[i - k + 1] = deque.peekFirst();
                }
            }
            return res;
        }

}
