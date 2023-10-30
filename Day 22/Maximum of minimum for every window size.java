class Solution 
{
    //Function to find maximum of minimums of every window size.
    static int[] maxOfMin(int[] arr, int n) 
    {
       
       int[] left = new int[n]; // To store the index of the first smaller element to the left
    int[] right = new int[n]; // To store the index of the first smaller element to the right
    Stack<Integer> stack = new Stack<>();
    int[] result = new int[n];

    // Calculate the left array
    for (int i = 0; i < n; i++) {
        while (!stack.isEmpty() && arr[i] <= arr[stack.peek()]) {
            stack.pop();
        }
        if (stack.isEmpty()) {
            left[i] = -1;
        } else {
            left[i] = stack.peek();
        }
        stack.push(i);
    }

    // Clear the stack for the right calculation
    stack.clear();

    // Calculate the right array
    for (int i = n - 1; i >= 0; i--) {
        while (!stack.isEmpty() && arr[i] <= arr[stack.peek()]) {
            stack.pop();
        }
        if (stack.isEmpty()) {
            right[i] = n;
        } else {
            right[i] = stack.peek();
        }
        stack.push(i);
    }

    // Calculate the maximum of the minimum values for each window size
    for (int i = 0; i < n; i++) {
        int windowSize = right[i] - left[i] - 1;
        result[windowSize - 1] = Math.max(result[windowSize - 1], arr[i]);
    }

    // Fill in any missing values
    for (int i = n - 2; i >= 0; i--) {
        result[i] = Math.max(result[i], result[i + 1]);
    }

    return result;
    }
}