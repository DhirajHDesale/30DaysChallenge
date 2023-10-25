class Solution {
    static int countSquares(int N) {
       int i=1;
        int count=0;
      
           while(i*i < N){
               count++;
               i++;
           }
       return count;
    }
}