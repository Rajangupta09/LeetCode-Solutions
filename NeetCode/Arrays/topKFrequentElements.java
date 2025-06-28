package NeetCode.Arrays;

import java.util.Map;
import java.util.PriorityQueue;
import java.util.stream.Collectors;
import java.util.*;

public class topKFrequentElements {

    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((x,y) -> x.getValue() - y.getValue());
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            pq.offer(entry);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        return pq.stream().map(Map.Entry::getKey).mapToInt(Integer::intValue).toArray();
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(topKFrequent(new int[] {1, 2, 2, 3, 3, 3}, 2)));
    }
}
