class Solution
{
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n)
    { 
       long[] result = new long[n]; // To store the next greater elements
    Stack<Integer> stack = new Stack<>(); // To store indices

    for (int i = 0; i < n; i++) {
        while (!stack.isEmpty() && arr[i] > arr[stack.peek()]) {
            int prevIndex = stack.pop();
            result[prevIndex] = arr[i];
        }
        stack.push(i);
    }

    // Any remaining elements in the stack have no greater element to their right
    while (!stack.isEmpty()) {
        int remainingIndex = stack.pop();
        result[remainingIndex] = -1;
    }

    return result;
    } 
}