class Solution {
    int transitionPoint(int arr[], int n) {
        int left = 0;
    int right = n - 1;
    int transitionPoint = -1;

    while (left <= right) {
        int mid = left + (right - left) / 2;

        if (arr[mid] == 1) {
            
            transitionPoint = mid;
            right = mid - 1;
        } else {
           
            left = mid + 1;
        }
    }

    return transitionPoint;
    }
}