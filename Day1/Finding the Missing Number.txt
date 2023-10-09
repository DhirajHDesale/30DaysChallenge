class Solution {
    int missingNumber(int array[], int n) {
     
int total = 1;
        for (int i = 2; i < (n + 1); i++) {
            total += i;
            total -= array[i - 2];
        }
        return total;
    }
}