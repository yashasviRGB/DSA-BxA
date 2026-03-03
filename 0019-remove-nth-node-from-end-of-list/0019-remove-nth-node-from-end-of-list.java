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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null && n == 1) return null;
        if(head == null) return null;
        ListNode curr = head;
        for(int i = 1; i<n; i++){
            curr = curr.next;
        }
        ListNode back = head;
        ListNode prev = null;
        while(curr.next != null){
            prev = back;
            back = back.next;
            curr = curr.next;
        }
        if(prev == null) return head.next;
        prev.next = back.next;
        back.next = null;

        return head;
    }
}