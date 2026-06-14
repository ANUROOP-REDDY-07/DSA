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
    int res;
    ListNode left;
    public void dfs(ListNode temp){
        if(temp.next!=null){
            dfs(temp.next);
        }
        res=Math.max(res,left.val+temp.val);
        left=left.next;
    }
    public int pairSum(ListNode head) {
        left=head;
        dfs(head);
        return res;
    }
}