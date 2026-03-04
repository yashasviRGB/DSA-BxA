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
    public ListNode partition(ListNode head, int x) {
        ListNode head1 = new ListNode(0);
        ListNode head2 = new ListNode(0);
        ListNode curr1 = head1;
        ListNode curr2 = head2;
        ListNode curr = head;
        while(curr != null){
            if(curr.val < x){
                curr1.next = curr;
                curr = curr.next;
                curr1.next.next = null;
                curr1 = curr1.next;
            }
            else{
                curr2.next = curr;
                curr = curr.next;
                curr2.next.next = null;
                curr2 = curr2.next;
            }
        }
        curr1.next = head2.next;
        return head1.next;
    }
}