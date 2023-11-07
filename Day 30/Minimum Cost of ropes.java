class Solution
{
    //Function to return the minimum cost of connecting the ropes.
    long minCost(long arr[], int n) 
    {
        // your code here
        PriorityQueue<Long> minHeap = new PriorityQueue<>();

       
        for (int i = 0; i < n; i++) {
            minHeap.offer(arr[i]);
        }

        long totalCost = 0;

        
        while (minHeap.size() > 1) {
           
            long firstRope = minHeap.poll();
            long secondRope = minHeap.poll();

           
            long mergedRope = firstRope + secondRope;
            totalCost += mergedRope;

           
            minHeap.offer(mergedRope);
        }

        return totalCost;
    }
}