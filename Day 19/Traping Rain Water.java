class Solution{
    
    
    static long trappingWater(int arr[], int n) { 
      if (n <= 2) {
        return 0; // Not enough blocks to trap water
    }

    long trappedWater = 0;
    int left = 0;
    int right = n - 1;
    int leftMax = 0;
    int rightMax = 0;

    while (left < right) {
        if (arr[left] < arr[right]) {
            if (arr[left] > leftMax) {
                leftMax = arr[left];
            } else {
                trappedWater += leftMax - arr[left];
            }
            left++;
        } else {
            if (arr[right] > rightMax) {
                rightMax = arr[right];
            } else {
                trappedWater += rightMax - arr[right];
            }
            right--;
        }
    }

    return trappedWater;
    } 
}


