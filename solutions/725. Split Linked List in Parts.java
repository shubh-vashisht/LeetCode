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
    public ListNode[] splitListToParts(ListNode root, int k) {
        ListNode[] ab = new ListNode[k];
        int[] sizes = new int[k];
        int length = size(root);
        int eversize = length/k;
        int rem = length%k;
        for(int i=0;i<sizes.length;i++){
            if(rem!=0){
                sizes[i] = eversize + 1;
                rem--;
            }else{
                sizes[i] = eversize;
            }
        }
        ListNode done = null;
        ListNode temp = root;
        for(int i =0;i<ab.length;i++){
              int counter = 0;
            
            if(temp==null){
                continue;
            }else{
                ListNode temphead = temp;
                while(counter<sizes[i]-1){
                    temp = temp.next;
                    counter++;
                }
                ListNode alpha = temp;
                temp = temp.next;
                alpha.next = null;
                ab[i] = temphead;
            }
        }
            
    return ab;
    }
    public int size(ListNode root){
        int ha = 0;
        while(root!=null){
            ha++;
            root=root.next;
        }
        return ha;
    }
}
