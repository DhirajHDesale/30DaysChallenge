class Solution
{
    public int[][] overlappedInterval(int[][] Intervals)
    {
       if (Intervals == null || Intervals.length <= 1) {
        return Intervals; // No merging required
    }

    
    Arrays.sort(Intervals, (a, b) -> Integer.compare(a[0], b[0]));

    List<int[]> mergedIntervals = new ArrayList<>();
    int[] currentInterval = Intervals[0];

    for (int i = 1; i < Intervals.length; i++) {
        int[] interval = Intervals[i];

        
        if (currentInterval[1] >= interval[0]) {
            currentInterval[1] = Math.max(currentInterval[1], interval[1]);
        } else {
            
            mergedIntervals.add(currentInterval);
            currentInterval = interval;
        }
    }

    
    mergedIntervals.add(currentInterval);


    int[][] result = new int[mergedIntervals.size()][2];
    for (int i = 0; i < mergedIntervals.size(); i++) {
        result[i] = mergedIntervals.get(i);
    }

    return result;
    }
}