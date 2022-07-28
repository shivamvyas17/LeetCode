class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        
  int row=arr.length;
        int col=arr[0].length;
        List<Integer> li=new ArrayList<>();
        int i=0,j=0;
        int temp=0;
        while(li.size()!=(row*col)){
            while(j<col-temp && li.size()!=(row*col)){
                li.add(arr[i][j++]);
            }
            j--;
            i++;
            while(i<row-temp && li.size()!=(row*col)){
                li.add(arr[i++][j]);
            }
            i--;
            j--;
            while(j>=temp && li.size()!=(row*col)){
                li.add(arr[i][j--]);
            }
            j++;
            i--;
            while(i>temp && li.size()!=(row*col)){
                li.add(arr[i--][j]);
            }
            i++;
            j++;
            temp++;
        }
        return li;
    }
}