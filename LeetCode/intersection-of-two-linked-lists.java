/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public int count(ListNode head){
        ListNode temp = head;
        int count = 0;
        while(temp!=null){
            count+=1;
            temp = temp.next;
        }
        return count;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int c1 = count(headA);
        int c2 = count(headB);
        int diff = (c1>c2)?c1-c2:c2-c1;
        for(int i=0;i<diff;i++){
            if(c1<c2){
                headB = headB.next;
            }else{
                headA = headA.next;
            }
        }
        while(headA!=null&&headB!=null){
            if(headA==headB){
                return headA;
            }else{
                headA = headA.next;
                headB = headB.next;
            }
        }
        return null;
        
    }
}