class Solution
{
    //Function to sort the binary array.
    static void binSort(int A[], int N)
    {
        // add your code here
        
        
       int countZeros = 0;
    
    
    for (int i = 0; i < N; i++) {
        if (A[i] == 0) {
            countZeros++;
        }
    }
    
    
    for (int i = 0; i < countZeros; i++) {
        A[i] = 0;
    }
    
    for (int i = countZeros; i < N; i++) {
        A[i] = 1;
    }
    }
}

