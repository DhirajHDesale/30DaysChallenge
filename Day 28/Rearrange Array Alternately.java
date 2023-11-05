class Solution{
    
    public static void rearrange(long arr[], int n){
        
         int maxIndex = n - 1;
    int minIndex = 0;
    long maxElement = arr[n - 1] + 1; 

    for (int i = 0; i < n; i++) {
       
        if (i % 2 == 0) {
            arr[i] += (arr[maxIndex] % maxElement) * maxElement;
            maxIndex--;
        } else {
           
            arr[i] += (arr[minIndex] % maxElement) * maxElement;
            minIndex++;
        }
    }

    for (int i = 0; i < n; i++) {
        
        arr[i] = arr[i] / maxElement; 
    }
        
    }
    
}


