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
    static List<ListNode> reverseList(ListNode head) {

        ListNode curr = head, prev = null, next;
        List<ListNode> result = new ArrayList<>();
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        result.add(prev);
        result.add(head);
        return result;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        
        ListNode dummy = new ListNode(-1,null);
        ListNode prev = dummy;
        ListNode end;
        ListNode front = head;
        ListNode second = head;
        while(second != null){
            end = second;
            int i = 1;
            for(; i<=k && second != null; i++){
                front = second;
                second = second.next;
            }
            if(i != k+1){
                break;
            }
            front.next = null;
            List<ListNode> result = reverseList(end);
            front = result.get(0);
            end = result.get(1);
            prev.next = front;
            // if(dummy.next == null) dummy = prev.next;
            end.next = second;
            prev = end;
            
        }
        return dummy.next;
    }
}