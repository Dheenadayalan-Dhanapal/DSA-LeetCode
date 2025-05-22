/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<Integer>();
        TreeNode head = root;
        while(head != null){
            if(head.left == null){
                ans.add(head.val);
                head = head.right;
            } else {
                TreeNode temp = head.left;
                while(temp.right != null && temp.right != head){
                    temp = temp.right;
                }
                if(temp.right == null){
                    temp.right = head;
                    head = head.left; 
                } else {
                    temp.right = null;
                    ans.add(head.val);
                    head = head.right;
                }
            }
        }
        return ans;
    }
}