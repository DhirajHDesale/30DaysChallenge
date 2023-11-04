class Hanoi {

    public long toh(int N, int from, int to, int aux) {
      
      if (N == 1) {
        System.out.println("move disk 1 from rod " + from + " to rod " + to);
        return 1;
    }
    
    long moves = 0;
    
    
    moves += toh(N - 1, from, aux, to);
    
    
    System.out.println("move disk " + N + " from rod " + from + " to rod " + to);
    moves++;
    
    
    moves += toh(N - 1, aux, to, from);
    
    return moves;  
    }
}
