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
    public ListNode rotateRight(ListNode head, int k) {
        int len=0;
        if(head==null){
            return head;
        }

        ListNode t=head;
        while(t!=null && t.next!=null){
            t=t.next;
            len++;
        }
        //System.out.println(len);
       k=k%(len+1);
       //System.out.println(k);

        //process
        while(k>0){
        ListNode temp=head;

        while(temp!=null && temp.next!=null){
            temp=temp.next;
        }
        temp.next=head;

        ListNode bef=head;
        while(bef.next!=temp){
            bef=bef.next;
        }
        bef.next=null;

        head=temp;

        k--;

        }

        return head;
        
    }
}