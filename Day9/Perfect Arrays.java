class Solution{
    
    public boolean IsPerfect(int a[], int n)
    {
       for (int i = 0; i < n; i++) {
            if (a[i] != a[n - 1 - i]) {
                return false; 
            }
        }
        return true; 
    }
    
}