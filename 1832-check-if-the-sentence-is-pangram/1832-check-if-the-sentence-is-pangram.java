class Solution {
    public boolean checkIfPangram(String sentence) {
        List<Character> allist = new ArrayList<>();
        
        // add all alphabets in a list
        for(char i='a';i<='z';i++)
        {
            allist.add(i);
        }
        
        // System.out.print(allist);
        
        //create a set of alphabets which is given
        // as we know set contains only unique value
        Set<Character> s = new HashSet<>();
        
        for(int i=0;i<sentence.length();i++)
        {
            s.add(sentence.charAt(i));
        }
        
        // after putting all char in set 
        // we have to sort the set so transfer all set elements to List 
        // and the sort with Collections
        List<Character> list = new ArrayList<>(s);
        
        Collections.sort(list);
        
        // and check is the both list equal or not and return.
        if(allist.equals(list))
            return true;
        return false;
    }
}