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
        if(head.next == null)return null;
        ListNode prev = head, curr = head;
        for(int i=0;i<n;i++){
            curr = curr.next;
        }
        if(curr == null) return head.next;
        while(curr.next!=null){
            curr = curr.next;
            prev = prev.next;
        }
        prev.next = prev.next.next;
        return head;
    }
}