class Solution {
    // Function to convert an infix expression to a postfix expression.
    public static String infixToPostfix(String exp) {
        
         StringBuilder postfix = new StringBuilder();
    Stack<Character> stack = new Stack<>();

    for (char c : exp.toCharArray()) {
        if (Character.isLetterOrDigit(c)) {
            postfix.append(c);
        } else if (c == '(') {
            stack.push(c);
        } else if (c == ')') {
            while (!stack.isEmpty() && stack.peek() != '(') {
                postfix.append(stack.pop());
            }
            if (!stack.isEmpty() && stack.peek() != '(') {
                return "Invalid expression"; // Unmatched closing parenthesis
            } else {
                stack.pop();
            }
        } else {
            while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                if (stack.peek() == '(') {
                    return "Invalid expression"; // Mismatched parenthesis
                }
                postfix.append(stack.pop());
            }
            stack.push(c);
        }
    }

    while (!stack.isEmpty()) {
        if (stack.peek() == '(') {
            return "Invalid expression"; // Unmatched opening parenthesis
        }
        postfix.append(stack.pop());
    }

    return postfix.toString();
}

static int precedence(char op) {
    if (op == '^') {
        return 3;
    } else if (op == '*' || op == '/') {
        return 2;
    } else if (op == '+' || op == '-') {
        return 1;
    }
    return 0; // Lowest precedence for other characters

    }
}