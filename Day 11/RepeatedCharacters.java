class Solution
{
    char firstRep(String S)
    {
       
       
    char []a= S.toCharArray();
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j])
                {
                    return a[i];
                }
            }
        }
        return '#' ;
       
    }
}