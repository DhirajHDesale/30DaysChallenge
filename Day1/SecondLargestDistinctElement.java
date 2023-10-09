class Solution {
    int print2largest(int arr[], int n) {
        
       if (n < 2) {
        return -1; 
    }

    int firstLargest = Integer.MIN_VALUE;
    int secondLargest = Integer.MIN_VALUE;

    for (int i = 0; i < n; i++) {
        if (arr[i] > firstLargest) {
            secondLargest = firstLargest;
            firstLargest = arr[i];
        } else if (arr[i] != firstLargest && arr[i] > secondLargest) {
            secondLargest = arr[i];
        }
    }

    if (secondLargest == Integer.MIN_VALUE) {
        return -1; 
    }

    return secondLargest; 
        
        
    }
}