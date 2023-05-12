/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class SolutionStack {
    public ListNode reverseList(ListNode head) {

        ListNode temp = head;
        Stack<ListNode> stack = new Stack<>();

        while (temp != null) {
            stack.push(temp);
            temp = temp.next;
        }

        if (stack.isEmpty()) return null;

        ListNode result = stack.pop();
        temp = result;

        while (!stack.isEmpty()) {
            temp.next = stack.pop();
            temp = temp.next;
        }
        temp.next = null;

        return result;
    }
}