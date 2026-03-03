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

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode newhead = new ListNode();
        ListNode newl1 = l1;
        ListNode newl2 = l2;
        int rem = 0;
        int quo = 0;
        int sum = 0;
        ListNode curr = newhead;
        while(newl1 != null && newl2 != null){
            quo = newl1.val + newl2.val + quo;
            rem = quo % 10;
            quo = quo / 10;
            ListNode newNode = new ListNode(rem);
            curr.next = newNode;
            curr = newNode;
            newl1 = newl1.next;
            newl2 = newl2.next;
        }
        while(newl1 != null){
            quo = newl1.val + quo;
            rem = quo % 10;
            quo = quo / 10;
            ListNode newNode = new ListNode(rem);
            curr.next = newNode;
            curr = newNode;
            newl1 = newl1.next;
        }
        while(newl2 != null){
            quo = newl2.val + quo;
            rem = quo % 10;
            quo = quo / 10;
            ListNode newNode = new ListNode(rem);
            curr.next = newNode;
            curr = newNode;
            newl2 = newl2.next;
        }
        while(quo != 0){
            rem = quo % 10;
            quo = quo / 10;
            ListNode newNode = new ListNode(rem);
            curr.next = newNode;
            curr = newNode;
        }
        return newhead.next;
    }
}