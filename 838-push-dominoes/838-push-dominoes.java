class Solution {
    public String pushDominoes(String dominoes) {
        
    
 int n = dominoes.length() ;
    StringBuilder str = new StringBuilder() ;
    
    char[] arr = new char[n+2] ;
    arr[0] = 'L' ;
    for(int i=0 ; i<n ; i++){
        arr[i+1] = dominoes.charAt(i) ;
    }
    arr[arr.length-1] = 'R' ;
    
    int previ = 0 ;
    for(int i=1 ; i<arr.length ; i++){
        if(arr[i] == 'L'){
            if(arr[previ] == 'L'){
                for(int x=previ+1 ; x<i ; x++){
                    arr[x] = 'L' ;
                }
            }
            else{ // previ == 'R'
                int lo = previ+1 ;
                int hi = i-1 ;
                while(lo<hi){
                    arr[lo] = 'R' ;
                    arr[hi] = 'L' ;
                    
                    lo++ ;
                    hi-- ;
                }
            }
            
            previ = i ;
        }
        else if(arr[i] == 'R'){
            if(arr[previ] == 'L'){
                // do nothing
            }
            else{ // previ == 'R'
                for(int x=previ+1 ; x<i ; x++){
                    arr[x] = 'R' ;
                }
            }
            previ = i ;
        }
        
        
    }
    
    for(int i=1 ; i<arr.length-1 ; i++){
        str.append(arr[i]) ;
    }
    
    return str.toString() ;
}}