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
    public int Sum(int a, int b, int c){
        return a+b+c;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode soln = head;
        int carry = 0;
        int a = 0,b=0;
        while(l1 != null || l2 != null){
            try{
                a = l1.val;
                l1 = l1.next;
            }
            catch(NullPointerException e){
                a = 0;
            }
            try{
                b = l2.val;
                l2 = l2.next;
            }
            catch(NullPointerException e){
                b = 0;
            }
            int temp = Sum(a,b,carry);
            if (temp > 9){
                temp = temp%10;
                carry = 1;
            }
            else{
                carry = 0;
            }
            soln.next = new ListNode(temp);
            
            soln = soln.next;
            
        }
        if (carry == 1){
            soln.next = new ListNode(carry);
        }
        return head.next;
    }
    
    
}