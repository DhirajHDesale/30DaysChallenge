class Solution
{
    // Complete the function
    int remainderWith7(String n)
    {
        int length = n.length();
        int remainder = 0;

        for (int i = 0; i < length; i++) {
            int digit = n.charAt(i) - '0'; 
            remainder = (remainder * 10 + digit) % 7;
        }

        return remainder;
    }
}