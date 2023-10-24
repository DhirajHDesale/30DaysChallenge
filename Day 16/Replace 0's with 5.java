class GfG {
    int convertfive(int N) {
      String numStr = Integer.toString(N);
    
    // Replace all '0' characters with '5'
    numStr = numStr.replace('0', '5');
    
    // Parse the modified string back to an integer
    int result = Integer.parseInt(numStr);
    
    return result;
    }
}