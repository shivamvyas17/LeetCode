class Solution {
    public String toLowerCase(String s) {
        
    StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch >= 'A' && ch <= 'Z'){
                ans.append((char)(ch + 32));
            } else{
                ans.append(ch);
            }
        }
        return ans.toString();
    }
}
