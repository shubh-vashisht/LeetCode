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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode ab = list1;
        ListNode start = null;
        ListNode end = null;
        int counter=0;
        while(ab.next!=null){
            if(counter+1==a){
                start = ab;
            }
            if(counter==b){
                end = ab.next;
            }
            ab=ab.next;
            counter++;
        }
      start.next = list2;
        ab = list2;
        while(ab.next!=null){
            ab = ab.next;
        }
        ab.next = end;
        return list1;
    }
}
