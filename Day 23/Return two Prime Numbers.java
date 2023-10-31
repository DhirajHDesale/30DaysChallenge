class Solution{
   
    static boolean isPrime(int n) {
    if (n <= 1) {
        return false;
    }
    if (n <= 3) {
        return true;
    }
    if (n % 2 == 0 || n % 3 == 0) {
        return false;
    }
    for (int i = 5; i * i <= n; i += 6) {
        if (n % i == 0 || n % (i + 2) == 0) {
            return false;
        }
    }
    return true;
}

static List<Integer> primeDivision(int N) {
    List<Integer> result = new ArrayList<>();
    if (N <= 2 || N % 2 != 0) {
        return result;
    }

    for (int i = 2; i <= N / 2; i++) {
        int num1 = i;
        int num2 = N - i;

        if (isPrime(num1) && isPrime(num2)) {
            result.add(num1);
            result.add(num2);
            break;
        }
    }

    return result;
}






}