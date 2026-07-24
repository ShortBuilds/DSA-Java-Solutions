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
    int maxLength = 0;
    public int longestZigZag(TreeNode root) {
        if (root == null) return 0;

        dfs (root.left, true, 1);
        dfs (root.right, false, 1);

        return maxLength;
    }
        private void dfs (TreeNode node, boolean isLeft, int count){

            if (node == null) return;

            maxLength = Math.max(maxLength, count);

            if (isLeft) {
                dfs(node.right, false, count+1);

                dfs(node.left, true, 1);
            }

            else{
                dfs(node.left, true, count+1);

                dfs(node.right, false, 1);
            }
        }
    }
