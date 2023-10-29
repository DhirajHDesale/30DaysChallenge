class Solution {
    static int findMaxLen(String S) {
        int n = S.length();
    Stack<Integer> stack = new Stack<>();
    int maxLen = 0;
    int start = -1; 

    for (int i = 0; i < n; i++) {
        char ch = S.charAt(i);

        if (ch == '(') {
            stack.push(i);
        } else {
            if (stack.isEmpty()) {
                
                start = i;
            } else {
                
                stack.pop();

                if (stack.isEmpty()) {
                   
                    maxLen = Math.max(maxLen, i - start);
                } else {
                    
                    maxLen = Math.max(maxLen, i - stack.peek());
                }
            }
        }
    }

    return maxLen;
    }
};