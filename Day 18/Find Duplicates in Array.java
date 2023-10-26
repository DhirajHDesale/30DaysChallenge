class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
                Arrays.sort(arr);
        ArrayList<Integer> res=new ArrayList<>();
        if(n==1){
            res.add(-1);
            return res;
        }
        int last=-1;
        int cur=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]==last)
            continue;
            if(arr[i-1]==arr[i]){
                last=arr[i];
                res.add(arr[i]);
            }
        }
        if(res.isEmpty()){
            res.add(-1);
            return res;
        }
        return res;







    }
}