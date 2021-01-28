/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        //using merge sort
        if(head==null||head.next==null){
            return head;
        }
        ListNode mid = findmid(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);
        return merge(left,right);
    }
    public ListNode findmid(ListNode head){
        ListNode midpriv = null;
        while(head!=null&&head.next!=null){
            if(midpriv==null){
                midpriv = head;
            }else{
                midpriv = midpriv.next;
            }
            head = head.next.next;
        }
        ListNode mid = midpriv.next;
        midpriv.next = null;
        return mid;
    }
    public ListNode merge(ListNode a, ListNode b){
        ListNode aloo = new ListNode();
        ListNode tail = aloo;
        while(a!=null&&b!=null){
            if(a.val<b.val){
                tail.next = a;
                a= a.next;
                tail = tail.next;   
            }else{
                 tail.next = b;
                  b = b.next; 
                tail = tail.next;        
            }
        }
        if(a!=null){
            tail.next = a;
        }else{
            tail.next = b;
        }
        return aloo.next;
    }
}
