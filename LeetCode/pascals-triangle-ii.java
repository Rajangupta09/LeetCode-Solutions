class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<Integer>();
        int i=rowIndex;
        long val=1;
        
        for(int j=0;j<=i;j++)
        {
            list.add((int)val);
            val=val*(i-j)/(j+1);
        }
      return list;        
    }
}