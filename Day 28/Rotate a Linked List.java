class Solution{
    //Function to rotate a linked list.
    public Node rotate(Node head, int k) {
       if (head == null || k <= 0) {
        return head;
    }

    Node current = head;
    int length = 1;

   
    while (current.next != null) {
        current = current.next;
        length++;
    }

   
    k = k % length;

    if (k == 0) {
        return head; 
    }

   
    current = head;

    
    for (int i = 1; i < k; i++) {
        current = current.next;
    }

    Node newHead = current.next;
    current.next = null;

   
    Node tail = newHead;
    while (tail.next != null) {
        tail = tail.next;
    }
    tail.next = head;

    return newHead;
    }
}
