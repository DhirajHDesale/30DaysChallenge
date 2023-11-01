class Solution
{
    // arr[]: input array
    // n: size of the array
    //Function to find triplets with zero sum.
	public boolean findTriplets(int arr[] , int n)
    {
        if (n < 3) {
        return false; 
    }

    Arrays.sort(arr); 

    for (int i = 0; i < n - 2; i++) {
        int left = i + 1;
        int right = n - 1;
        int target = -arr[i]; 

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                return true; 
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
    }

    return false;
        
    }
}