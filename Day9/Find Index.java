class Solution
{ 
    // Function to find starting and end index 
    static int[] findIndex(int a[], int N, int key) 
    { 
        int[] arr=new int[2];
        int c=0;
        for(int i=0;i<N;i++){
            if(a[i]==key){
                arr[0]=i;
                
                break;
            }
            else{
                arr[0]=-1;
            }
        }
        for(int i=N-1;i>=0;i--){
            if(a[i]==key){
                arr[1]=i;
                break;
            }
            else{
                arr[1]=-1;
            }
        }
        return arr;
       
    }
}


