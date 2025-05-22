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
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        TreeNode head = root;
        ArrayList<Integer> ans = inOrder(head,res);
        int[] out = ans.stream().mapToInt(i -> i).toArray();
        return out[k - 1];
    }
    public ArrayList<Integer> inOrder(TreeNode root,ArrayList<Integer> res){
        if(root == null){
            return res;
        }
        inOrder(root.left,res);
        res.add(root.val);
        inOrder(root.right,res);
        return res;
    }
}