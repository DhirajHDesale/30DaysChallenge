class Solution {
    int getPairsCount(int[] arr, int n, int k) {
       HashMap<Integer, Integer> numFrequency = new HashMap<>();
    
    
    int count = 0;

    
    for (int i = 0; i < n; i++) {
       
        int diff = k - arr[i];
        
        
        if (numFrequency.containsKey(diff)) {
            count += numFrequency.get(diff);
        }
        
       
        numFrequency.put(arr[i], numFrequency.getOrDefault(arr[i], 0) + 1);
    }
    
  
    return count;
    }
}