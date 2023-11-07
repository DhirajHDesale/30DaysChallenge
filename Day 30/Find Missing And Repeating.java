class Solve {
    int[] findTwoElement(int arr[], int n) {
      int[] result = new int[2];
    
    for (int i = 0; i < n; i++) {
        int num = Math.abs(arr[i]);
        if (arr[num - 1] > 0) {
            arr[num - 1] = -arr[num - 1];
        } else {
            result[0] = num;
        }
    }
    
    for (int i = 0; i < n; i++) {
        if (arr[i] > 0) {
            result[1] = i + 1;
            break;
        }
    }
    
    return result;
    }
}