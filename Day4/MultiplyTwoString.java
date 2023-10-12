class Solution
{
    public String multiplyStrings(String s1,String s2)
    {
         BigInteger num1 = new BigInteger(s1);
        BigInteger num2 = new BigInteger(s2);
        BigInteger result = num1.multiply(num2);

        return result.toString();
    }
}