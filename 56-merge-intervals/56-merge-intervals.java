class Solution {
    public int[][] merge(int[][] intervals) {
        
    
  if(intervals.length == 1) return intervals;

        Arrays.sort(intervals, (a,b)->{return a[0] - b[0];});
        int[] temp = null;
        List<int[]> ret = new ArrayList<>();
        for(int i=0;i<intervals.length;i++){
            if(null == temp)  temp = intervals[i];
            if(intervals[i][0]<=temp[1]) {
                temp[1] = Math.max(intervals[i][1], temp[1]);
                temp[0] = Math.min(intervals[i][0], temp[0]);
            } else {
                ret.add(temp);
                temp= intervals[i];
            }
        }
        if(null != temp)  ret.add(temp);
        return ret.toArray(new int[ret.size()][2]);
    }
}