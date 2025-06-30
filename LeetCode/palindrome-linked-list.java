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
    public boolean isPalindrome(ListNode head) {
        ListNode head1 = head;
        ListNode prev = null;
        
        ListNode mid = head;
        ListNode curr = head;
        ListNode end = head;
        int count= 0;
        while(end!= null&& end.next!=null){
            
            mid = mid.next;
            end = end.next.next;
        }
        
        while(head1!=mid){
            ListNode temp = head1.next;
            head1.next = prev;
            prev = head1;
            head1 = temp;
        }
        if(end!=null){
            mid = mid.next;
        }
    
        
        while(mid!= null){
            System.out.println(mid.val);
            if(prev.val!=mid.val)return false;
            mid = mid.next;
            prev = prev.next;
        }
        return true;
        
    }
}