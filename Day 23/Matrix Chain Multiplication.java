class Solution{
    static int matrixMultiplication(int N, int arr[])
    {
        int[][] dp = new int[N][N];

    
    for (int i = 1; i  N; i++) {
        dp[i][i] = 0;
    }

    
    for (int chainLength = 2; chainLength  N; chainLength++) {
        for (int i = 1; i  N - chainLength + 1; i++) {
            int j = i + chainLength - 1;
            dp[i][j] = Integer.MAX_VALUE;

            for (int k = i; k  j; k++) {
                int cost = dp[i][k] + dp[k + 1][j] + arr[i - 1]  arr[k]  arr[j];
                if (cost  dp[i][j]) {
                    dp[i][j] = cost;
                }
            }
        }
    }