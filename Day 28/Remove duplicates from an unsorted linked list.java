class Solution
{
    public Node removeDuplicates(Node head)     {
        if (head == null) {
        return head;
    }

    HashSet<Integer> seenValues = new HashSet<>();
    Node current = head;
    seenValues.add(current.data);

    while (current.next != null) {
        if (seenValues.contains(current.next.data)) {
            // Remove the duplicate node
            current.next = current.next.next;
        } else {
            seenValues.add(current.next.data);
            current = current.next;
        }
    }

    return head;
        
    }
}
