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
    public int pairSum(ListNode head) {
        ListNode slow, fast;
        slow = head;
        fast = head; 
        while (fast!= null&& fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode prev = null;

        while (slow!=null){
            ListNode nextNode = slow.next;
            slow.next = prev;
            prev = slow;
            slow = nextNode;
        }

        int maxSum =0;
        ListNode left = head, right = prev;

        while (right!=null){
            maxSum = Math.max(maxSum, left.val+ right.val);
            left = left.next;
            right = right.next;
        }
        return maxSum;
    }
}