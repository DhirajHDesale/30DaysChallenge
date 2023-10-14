class Geeks {
    static void isPrime(int n) {
        
       int c = 0;
    
    for (int i = 2; i <= n / 2; i++) {
        if (n % i == 0) {
            c++;
            break; 
        }
    }
    
    if (c == 0 && n!=1) {
        System.out.println("Yes");
    } else {
        System.out.println("No");
    }
    }
}