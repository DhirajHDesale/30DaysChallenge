class Solution
{
  
  
       public Node reverseList(Node head) {
    Node current = head;
    Node prev = null;
    Node next = null;

    while (current != null) {
        next = current.next; 
        current.next = prev; 
        prev = current; 
        current = next; 
    }

    
    head = prev;

    return head;
    }
}
