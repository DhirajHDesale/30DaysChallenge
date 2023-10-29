class Solution
{
    //Function to find the length of a loop in the linked list.
    static int countNodesinLoop(Node head)
    {
       Node slow = head;
    Node fast = head;
    boolean loopExists = false;

    // Detect if there is a loop and find the meeting point of slow and fast pointers
    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
        if (slow == fast) {
            loopExists = true;
            break;
        }
    }

    // If there is no loop, return 0
    if (!loopExists) {
        return 0;
    }

    // Find the count of nodes in the loop
    int count = 1;
    Node temp = slow;
    while (temp.next != slow) {
        count++;
        temp = temp.next;
    }

    return count;
    }
}