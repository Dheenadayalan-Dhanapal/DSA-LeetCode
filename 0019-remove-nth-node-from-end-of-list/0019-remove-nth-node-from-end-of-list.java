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
        ListNode curr = head;
        int count = 0;

        if(curr == null || curr.next == null){
            return null;
        }
        while(curr != null){
            curr = curr.next;
            count++;
        }
        if(count == n){
            return head.next;
        }
        int i = 1;
        curr = head;
        while( i < (count - n) ){
            curr = curr.next;
            i++;
        }
        if(curr.next != null){
            curr.next = curr.next.next;
        }
        return head;
    }
}