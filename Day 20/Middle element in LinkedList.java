class Solution
{
    int getMiddle(Node head)
    {
      if (head == null) {
        return -1; // Handle the case when the list is empty.
    }

    Node slowPointer = head;
    Node fastPointer = head;

    while (fastPointer != null && fastPointer.next != null) {
        slowPointer = slowPointer.next;
        fastPointer = fastPointer.next.next;
    }

    return slowPointer.data;   
    }
}
