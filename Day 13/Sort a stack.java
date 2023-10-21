class GfG{
	public Stack<Integer> sort(Stack<Integer> stack)
	{
	Stack<Integer> sortedStack = new Stack<>();

        while (!stack.isEmpty()) {
            int temp = stack.pop();

            while (!sortedStack.isEmpty() && sortedStack.peek() > temp) {
                stack.push(sortedStack.pop());
            }

            sortedStack.push(temp);
        }

        return sortedStack;
	}
}