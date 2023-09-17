class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        // Create a dummy node to serve as the new head of the list.
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // Initialize pointers for the previous node of the left section
        // and the current node at the beginning of the left section.
        ListNode leftPreNode = dummy;
        ListNode currentNode = head;

        // Move leftPreNode and currentNode to their appropriate positions.
        for(int i = 0; i < left - 1; i++) {
            leftPreNode = leftPreNode.next;
            currentNode = currentNode.next;
        }

        // Initialize a pointer for the previous node and the head of the sublist
        // that will be reversed.
        ListNode preNode = null;
        ListNode subListHead = currentNode;

        // Reverse the sublist from left to right.
        for(int i = 0; i <= right - left; i++) {
            ListNode nextNode = currentNode.next;
            currentNode.next = preNode;
            preNode = currentNode;
            currentNode = nextNode;
        }

        // Connect the reversed sublist back to the main list.
        leftPreNode.next = preNode;
        subListHead.next = currentNode;

        // Return the modified list starting from the dummy node.
        return dummy.next;
    }
}