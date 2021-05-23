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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode temp;
        ListNode t;
        if(l1 == null)
            return l2;
        if(l2 == null)
            return l1;
        if (l1.val > l2.val){
            t = l2;
            l2 = l2.next;
        }else{
            t = l1;
            l1 = l1.next;
        }
        
        temp = t;
        
        while(l1 != null && l2 != null){

            if(l1.val>l2.val){
                temp.next = l2;
                temp = l2;
                l2 = l2.next;
            }else{
                temp.next = l1;
                temp = l1;
                l1 = l1.next;
            }
        }
        if (l1 == null){
            temp.next = l2;
        }
        else{
            temp.next = l1;
        }
        
        return t;
    }
}