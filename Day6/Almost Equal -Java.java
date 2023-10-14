class Geeks{
    
    static int coutChars(String s1, String s2)
    {
      
       int[] countS1 = new int[26]; 
        int[] countS2 = new int[26];

        for (char c : s1.toCharArray()) {
            countS1[c - 'a']++;
        }

        for (char c : s2.toCharArray()) {
            countS2[c - 'a']++;
        }

       
        int deletions = 0;
        for (int i = 0; i < 26; i++) {
            deletions += Math.abs(countS1[i] - countS2[i]);
        }

        return deletions;
    }

   



}