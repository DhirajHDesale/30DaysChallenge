class Geeks{
    
    static void checkString(String s)
    {
        int v=0;
        int c=0;
        
        String f = s.replaceAll("\\s", "");
       for(int i = 0;i<f.length();i++){
           if(f.charAt(i)=='a' || f.charAt(i)=='e' || f.charAt(i)=='i'|| f.charAt(i)=='o'|| f.charAt(i)=='u')
           v++;
           else
           c++;
       }
       if(v>c)
       System.out.println("Yes");
       else if(c>v){
           System.out.println("No");
       }else {
           System.out.println("Same");
       }
        
       
    }
}
