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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        if (root.left == null && root.right == null) return 1;
        int level =0;
        int maxSum=Integer.MIN_VALUE;
        int maxlevel=0;
        while (!queue.isEmpty()) {
            level++;
            int levelSize = queue.size();
            int levelSum =0;
            for (int i =0; i<levelSize; i++){
                TreeNode currentNode = queue.poll();
                levelSum = levelSum + currentNode.val;
                if (currentNode.left!= null) queue.offer(currentNode.left);
                if (currentNode.right!= null) queue.offer(currentNode.right);
            }

            if (maxSum< levelSum) 
            {
                maxSum=levelSum;
                maxlevel = level;
            }
        }
        return maxlevel;
        
    }
}