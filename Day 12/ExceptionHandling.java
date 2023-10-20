class TestClass
{
     private int a;
    private int b;
    TestClass(int a,int b){
        this.a=a;
        this.b=b;
    }

     
    public void findMin(){
        int min=Integer.MAX_VALUE;
        try{
            min=Math.min(min,a*b);
            min=Math.min(min,a/b);
            min=Math.min(min,a+b);
            min=Math.min(min,a-b);
        }
        catch(Exception c){
            
        }
        System.out.println(min);
        
    }
}