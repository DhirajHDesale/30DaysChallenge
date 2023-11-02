class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
       
        long maxSum = arr[0];  
    long currentSum = arr[0];  
    for (int i = 1; i < n; i++) {
        
        currentSum = Math.max((long) arr[i], currentSum + arr[i]);

       
        maxSum = Math.max(maxSum, currentSum);
    }

    return maxSum;
      
    }
    
}

