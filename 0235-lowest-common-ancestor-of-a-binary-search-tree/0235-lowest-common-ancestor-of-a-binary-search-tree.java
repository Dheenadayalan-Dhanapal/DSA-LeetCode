/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode head = root;
        TreeNode temp = root;
        while(head != null){
            if(head.val == p.val || head.val == q.val){
                return head;
            }
            if(p.val < head.val && q.val < head.val){
                head = head.left;
            } else if(p.val > head.val && q.val > head.val){
                head = head.right;
            } else {
                return head;
            }
        }
        return temp;
    }
}