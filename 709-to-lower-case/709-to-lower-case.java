class Solution {
    public String toLowerCase(String s) {
        
     String res="";
        for(char i:s.toCharArray()){
            if(i>='A'&& i<='Z'){
                res+=(char)(i+32);
            }
            else{res+=i;}
        }
        return res;
    }
}