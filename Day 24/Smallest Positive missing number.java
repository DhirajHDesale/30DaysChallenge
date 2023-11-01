class Solution
{
    //Function to find the smallest positive number missing from the array.
    static int missingNumber(int arr[], int size)
    {
       int i = 0;
    while (i < size) {
        if (arr[i] > 0 && arr[i] <= size && arr[i] != arr[arr[i] - 1]) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            } else {
                i++;
            }
        } else {
            i++;
        }
    }

    for (i = 0; i < size; i++) {
        if (arr[i] != i + 1) {
            return i + 1;
        }
    }

    return size + 1;
    }
}