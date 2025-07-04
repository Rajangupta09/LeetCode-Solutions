package NeetCode.SlidingWindow;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class SlidingWindowMaximum {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        List<Integer> ls = new ArrayList<>();
        if (n<k) return new int[0];
        PriorityQueue<int[]> pq = new PriorityQueue<>((x,y) -> y[0] - x[0]);
        
        for (int i = 0;i<k;i++) {
            pq.offer(new int[] {nums[i], i});
        }

        int l = 1;
        ls.add(pq.peek()[0]);
        for (int r = k;r<n;r++) {
            pq.offer(new int[] {nums[r], r});
            while (!pq.isEmpty() && pq.peek()[1] < l){
                pq.poll();
            }
            ls.add(pq.peek()[0]);
            l++;
        }
        return ls.stream().mapToInt(Integer::valueOf).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(maxSlidingWindow(new int[]{1,2,1,0,4,2,6}, 3)));
    }
}
