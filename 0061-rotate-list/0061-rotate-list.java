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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null) return head;
        int n = 0;
        ListNode temp = head;
        ListNode tail = head;
        while(temp != null){
            n++;
            temp = temp.next;
        }
        k = k % n;
        if(k == 0) return head;
        tail = head;
        for(int i = 1; i <= k; i++){
            tail = tail.next;
        }
        temp = head;
        while(tail.next != null){
            tail = tail.next;
            temp = temp.next;
        }
        tail.next = head;
        head = temp.next;
        temp.next = null;
        return head;
    }
}