public class SecondSolution {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {
        public ListNode reverseList(ListNode head) {
            if(head == null) return null;
            if(head.next == null) return head;

            ListNode dummy_head = null;
            ListNode current_head = head;

            while (current_head != null) {
                ListNode next_head = current_head.next;
                current_head.next = dummy_head;
                dummy_head = current_head;
                current_head = next_head;
            }

            head = dummy_head;

            return head;
        }
    }
}
