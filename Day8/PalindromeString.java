class Solution {
    int isPalindrome(String S) {
       
      String ans =  S.toLowerCase();
      int length = ans.length();
         for (int i = 0; i < length / 2; i++) {
            if (ans.charAt(i) != ans.charAt(length - 1 - i)) {
                return 0; 
            }
        }
        return 1;
       
    }
};