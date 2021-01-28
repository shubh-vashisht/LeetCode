/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if((head==null)||(head.next==null)){
            return null;
        }
        ListNode a=head;
        ListNode b=head;
        while(b!=null&&b.next!=null){
         a=a.next;
            b=b.next.next;
            if(a==b){
                a=head;
                while(a!=b){
                    a=a.next;
                    b=b.next;
                }
                return a;
            }
                
            
    }
        return null;
}
}
