import java.util.Collections;

class Solution {
    public String[] findRelativeRanks(int[] score) {
        String[] sc = new String[score.length];
        int[] sortedIndices = IntStream.range(0, score.length).boxed().sorted((i, j) -> Integer.valueOf(score[j]).compareTo(Integer.valueOf(score[i])))
                .mapToInt(ele -> ele).toArray();
        for(int i =0;i<sortedIndices.length;i++){
            if(i == 0)sc[sortedIndices[i]]="Gold Medal";
            else if(i==1)sc[sortedIndices[i]]="Silver Medal";
            else if(i==2)sc[sortedIndices[i]]="Bronze Medal";
            else sc[sortedIndices[i]] = Integer.toString(i+1);
        }
        
        return sc;
    }
}