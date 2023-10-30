class Compute {
    
    public long[] printFirstNegativeInteger(long A[], int N, int K)
    {
        long[] result = new long[N - K + 1];
    LinkedList<Long> queue = new LinkedList<>();

    int resultIndex = 0;
    int arrayIndex = 0;

    while (arrayIndex < N) {
        if (A[arrayIndex] < 0) {
            queue.addLast(A[arrayIndex]);
        }

        if (arrayIndex - resultIndex + 1 == K) {
            if (queue.isEmpty()) {
                result[resultIndex] = 0; // No negative number in the window
            } else {
                result[resultIndex] = queue.getFirst();
                if (A[resultIndex] == queue.getFirst()) {
                    queue.removeFirst();
                }
            }
            resultIndex++;
        }

        arrayIndex++;
    }

    return result;
        
    }
}