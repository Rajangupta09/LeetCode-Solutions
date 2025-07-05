package NeetCode.BinarySearch;

import java.util.Arrays;

public class KokoEatingBananas {
    
    public static int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = Arrays.stream(piles).max().getAsInt();
        int result = -1;
        while (l <= r) {
            int mid = l + (r-l)/2;
            if (canEat(piles, mid, h)) {
                result = mid;
                r = mid-1;
            } else {
                l = mid+1;
            }
        }
        return result;
    }

    static boolean canEat(int[] piles, int k, int h) {
        int curr = 0;
        for (int pile : piles) {
            curr += pile / k;
            curr += pile % k != 0 ? 1 : 0;
        }
        return curr<=h;
    }
    
    public static void main(String[] args) {
        System.out.println(minEatingSpeed(new int[]{25,10,23,4}, 4));
    }
}
