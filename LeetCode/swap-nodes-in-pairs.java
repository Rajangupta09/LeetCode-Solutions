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
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next==null){
            return head;
        }
        ListNode prev = head,curr = head.next, temp = null;
        head = curr;
        while(prev!=null){
            prev.next = curr.next;
            curr.next = prev;
            if(temp !=null){
                temp.next = curr;
            }
            temp = prev;
            prev = prev.next;
            if(prev == null||prev.next == null)break;
            curr = prev.next;
        }
        return head;
    }
}