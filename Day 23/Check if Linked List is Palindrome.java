class Solution
{
    
    boolean isPalindrome(Node head) 
    {
         if (head == null || head.next == null) {
        return true; 
    }

   
    Node slow = head;
    Node fast = head;

    while (fast.next != null && fast.next.next != null) {
        slow = slow.next;
        fast = fast.next.next;
    }

  
    Node secondHalf = reverseList(slow.next);

   
    Node firstHalf = head;
    while (secondHalf != null) {
        if (firstHalf.data != secondHalf.data) {
            return false; 
        }
        firstHalf = firstHalf.next;
        secondHalf = secondHalf.next;
    }

    return true; 
}

private Node reverseList(Node head) {
    Node prev = null;
    Node current = head;
    Node next = null;

    while (current != null) {
        next = current.next;
        current.next = prev;
        prev = current;
        current = next;
    }

    return prev;
}
        
}

