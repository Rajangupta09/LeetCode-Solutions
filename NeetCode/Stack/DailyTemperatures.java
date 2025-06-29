package NeetCode.Stack;

import java.util.Arrays;
import java.util.Stack;
public class DailyTemperatures {
    
    static int[] dailyTemperatures(int[] tempertures) {
        Stack<Pair<Integer, Integer>> st = new Stack<>();
        int n = tempertures.length;
        int[] result = new int[n];
        for (int i = n-1;i>=0;i--) {
            while (!st.isEmpty() && st.peek().first<=tempertures[i]){
                st.pop();
            }
            result[i] = st.isEmpty() ? 0 : st.peek().second - i;
            st.push(new Pair(tempertures[i], i));
            
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        System.out.println(Arrays.toString(dailyTemperatures(new int[]{30,38,30,36,35,40,28})));
    }
}
