class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> arr = new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> n = new ArrayList<Integer>();
            for(int j=0;j<i+1;j++){
                if(j==0||j==i){
                    n.add(1);
                }
                else{
                    int temp = arr.get(i-1).get(j-1) + arr.get(i-1).get(j);
                    n.add(temp);
                }
            }
            arr.add(n);
        }
     return arr;   
    }
}