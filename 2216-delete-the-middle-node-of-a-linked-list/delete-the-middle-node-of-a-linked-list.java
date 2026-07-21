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
    public ListNode deleteMiddle(ListNode head) {
        ListNode temp = head;
        int n =0;
        if (head == null || head.next == null) return null;
        while (temp!=null){
            temp = temp.next;
            n++;
        }

        temp = head;
        int res = n/2;

        while (temp!=null){
            res--;
            if (res==0){
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
        }

        return head;
    }
}