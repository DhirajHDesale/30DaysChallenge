class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {ArrayList<Integer> result = new ArrayList<>();
    Map<Integer, Integer> prefixSumMap = new HashMap<>();
    int currentSum = 0;

    for (int right = 0; right < n; right++) {
        currentSum += arr[right];

        if (currentSum == s) {
            result.add(1);
            result.add(right + 1); 
            return result;
        }

        if (prefixSumMap.containsKey(currentSum - s)) {
            int left = prefixSumMap.get(currentSum - s) + 1; 
            result.add(left + 1); 
            result.add(right + 1);
            return result;
        }

        prefixSumMap.put(currentSum, right);
    }

    result.add(-1); 
    return result;
    }
}