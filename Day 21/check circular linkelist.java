class GfG
{
    boolean isCircular(Node head)
    {
	 if (head == null) {
        return true; 
    }

    Node slow = head;
    Node fast = head;

    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;

        if (slow == fast) {
            return true; 
    }

    return false;
    }
}