class Solution {
    int findKRotation(int arr[], int n) {
        // code here
          int left = 0;
        int right = n - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] > arr[right]) {
                // The pivot point is to the right of 'mid'.
                left = mid + 1;
            } else {
                // The pivot point is to the left of 'mid' or 'mid' itself.
                right = mid;
            }
        }

        return left;
    }
}