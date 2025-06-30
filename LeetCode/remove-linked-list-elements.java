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
    public ListNode removeElements(ListNode head, int val) {
        
        while(head!=null && head.val == val)
            head = head.next;
        ListNode curr = head;  
        ListNode prev = head;
        while(prev!=null){
            while(curr.next!=null && curr.next.val == val)
                curr = curr.next;
            curr = curr.next;
            prev.next = curr;
            prev = curr;
        }
        return head;
    }
}