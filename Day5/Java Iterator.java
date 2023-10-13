class Solution {
    static ArrayList<Integer> javaIterator(int n, int k, int[] arr) {
        
         ArrayList<Integer> ans = new ArrayList<>();

    for (int i = 0; i < n; i++) {
        if (arr[i] >= k) {
            ans.add(arr[i]);
        }
    }

    Collections.sort(ans);

    return ans;
    }
};