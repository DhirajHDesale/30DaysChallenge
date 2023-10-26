class Solution {
    static String isSumOfTwo(int N){
         for (int i = 2; i <= N / 2; i++) {
        boolean isIPrime = true;
        boolean isNMinusIPrime = true;

        for (int j = 2; j <= Math.sqrt(i); j++) {
            if (i % j == 0) {
                isIPrime = false;
                break;
            }
        }

        for (int j = 2; j <= Math.sqrt(N - i); j++) {
            if ((N - i) % j == 0) {
                isNMinusIPrime = false;
                break;
            }
        }

        if (isIPrime && isNMinusIPrime) {
            return "Yes";
        }
    }

    return "No";
    }
}