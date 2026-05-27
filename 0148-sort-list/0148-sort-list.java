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
    public ListNode sortList(ListNode head) {
        Queue<ListNode> pq = new PriorityQueue<>((a,b)-> Integer.compare(a.val,b.val));
        ListNode curr = head;
        if(head == null) return head;
        while(curr != null){
            pq.offer(curr);
            curr = curr.next;
        }
        ListNode newHead = pq.poll();
        ListNode prev = newHead;
        while(!pq.isEmpty()){
            curr = pq.poll();
            prev.next = curr;
            prev = prev.next;
        }
        prev.next = null;
        return newHead;
    }
}