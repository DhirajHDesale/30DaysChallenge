class Solution{
    int LastIndex(String s, char p){
       for(int i = s.length()-1;i>=0;i--){
           if(p==s.charAt(i))
           return i;
       }
       return -1;
    }

}