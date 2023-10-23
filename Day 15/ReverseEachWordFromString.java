class Solution
{
   
    String reverseWords(String S)
    {
     StringBuilder reversedString = new StringBuilder();
    StringBuilder currentWord = new StringBuilder();

    for (char c : S.toCharArray()) {
        if (c == '.') {
            reversedString.append(currentWord.reverse()).append('.');
            currentWord.setLength(0);  
        } else {
            currentWord.append(c);
        }
    }

    
    reversedString.append(currentWord.reverse());

    return reversedString.toString();
    }
}