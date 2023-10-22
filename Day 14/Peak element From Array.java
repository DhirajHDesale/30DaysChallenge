class Solution
{
	// Function to find the peak element
	// arr[]: input array
	// n: size of array a[]
	public int peakElement(int[] arr,int n)
    {
       int left = 0;
        int right = n - 1;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] > arr[mid + 1]) {
                // We are in a decreasing subarray, so a peak element might be to the left.
                right = mid;
            } else {
                // We are in an increasing subarray, so a peak element might be to the right.
                left = mid + 1;
            }
        }
        
        return left;
    }
}