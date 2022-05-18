class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        HashMap<Integer,Integer> row=new HashMap<>();
        HashMap<Integer,Integer> col=new HashMap<>();
        for(int i=0;i<matrix.length;i++){
          for(int j=0;j<matrix[0].length;j++){
            row.put(i,Math.min(row.getOrDefault(i,Integer.MAX_VALUE),matrix[i][j]));
            col.put(j,Math.max(col.getOrDefault(j,Integer.MIN_VALUE),matrix[i][j]));
            
          }
        }
        List<Integer> ls=new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
          for(int j=0;j<matrix[0].length;j++){
            if(row.get(i)==matrix[i][j]&&col.get(j)==matrix[i][j])ls.add(matrix[i][j]);
          }
        }
      return ls;
    }
}