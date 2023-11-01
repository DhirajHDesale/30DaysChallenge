class Compute {
    public String isSubset( long a1[], long a2[], long n, long m) {
        
        Map<Long, Integer> countMap = new HashMap<>();

   
    for (int i = 0; i < n; i++) {
        countMap.put(a1[i], countMap.getOrDefault(a1[i], 0) + 1);
    }

   
    for (int i = 0; i < m; i++) {
        if (!countMap.containsKey(a2[i]) || countMap.get(a2[i]) <= 0) {
        }
        countMap.put(a2[i], countMap.get(a2[i]) - 1); 
    }

    return "Yes";
    }
}