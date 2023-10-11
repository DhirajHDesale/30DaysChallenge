int getMin()
    {
	// Your code here
 if (s.isEmpty()) {
            return -1; 
        }
        return minEle;
    }
    
    /*returns poped element from stack*/
    int pop()
    {
 if (s.isEmpty()) {
            return -1; 
        }
        int top = s.pop();
        if (top < minEle) {
            int prevMin = minEle;
            minEle = 2 * minEle - top; 
            return prevMin;
        }
        return top;
    }

    /*push element x into the stack*/
    void push(int x) {
    if (s.isEmpty()) {
        s.push(x);
        minEle = x;
    } else {
        if (x < minEle) {
            s.push(2 * x - minEle);
            minEle = x;
        } else {
            s.push(x);
        }
    } }