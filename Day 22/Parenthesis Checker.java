class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
       Stack<Character> stack = new Stack<>();

    for (int i = 0; i < x.length(); i++) {
        char currentChar = x.charAt(i);

        if (currentChar == '(' || currentChar == '{' || currentChar == '[') {
            stack.push(currentChar);
        } else if (currentChar == ')' || currentChar == '}' || currentChar == ']') {
            if (stack.isEmpty()) {
                return false; // No matching opening bracket
            }

            char top = stack.pop();
            if (!areBracketsMatching(top, currentChar)) {
                return false; // Mismatched brackets
            }
        }
    }

    return stack.isEmpty();
}

static boolean areBracketsMatching(char opening, char closing) {
    return (opening == '(' && closing == ')') ||
           (opening == '{' && closing == '}') ||
           (opening == '[' && closing == ']');
}
    
}
