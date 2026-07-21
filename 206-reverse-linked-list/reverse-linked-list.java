/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val -= val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        
        while (curr != null) {
            // 1. Save the next node so we don't lose the rest of the list
            ListNode nextTemp = curr.next;
            
            // 2. Actually reverse the pointer to point backwards
            curr.next = prev;
            
            // 3. Move the 'prev' pointer forward one step
            prev = curr;
            
            // 4. Move the 'curr' pointer forward one step (using our saved reference)
            curr = nextTemp;
        }
        
        // When the loop finishes, 'curr' is null (fell off the end).
        // 'prev' is standing on the very last node, which is our new head.
        return prev;
    }
}