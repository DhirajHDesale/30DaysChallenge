class Solution
{
     long floorSqrt(long x)
	 {
		 if (x == 0 || x == 1) {
            return x;
        }

        long left = 1, right = x;
        long result = 0;
        while (left <= right) {
            long mid = left + (right - left) / 2;
            if (mid == x / mid) {
                return mid;
            } else if (mid < x / mid) {
                left = mid + 1;
                result = mid;
            } else {
                right = mid - 1;
            }
        }
        return result;
	 }
}