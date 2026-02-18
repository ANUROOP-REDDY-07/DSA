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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length=0;
        ListNode temp=head;

        while(temp.next!=null){
            length++;
            temp=temp.next;
        }
        length=length+1;

        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode prev=dummy;
        temp=head;

        int nodecount=length-n;

        while(nodecount>0){
                temp=temp.next;
                prev=prev.next;
                nodecount--;
        }
        prev.next=temp.next;

    return dummy.next;
    }
}