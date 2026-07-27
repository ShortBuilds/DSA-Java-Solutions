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
        List<Integer> sums = new ArrayList<>();

        dfs(root, 0, sums);
        int maxSum = -100000;
        int maxLevel =1;
        for (int i=0; i<sums.size(); i++){
            if (sums.get(i)>maxSum ){
                maxSum= sums.get(i);
                maxLevel = i+1;
            }
        }
        return maxLevel;

    }

    private void dfs(TreeNode node, int depth, List<Integer>sums) {
        if (node == null) return; 

        if (depth == sums.size()){
            sums.add(node.val);
        }
        else {
            sums.set(depth, sums.get(depth)+node.val);
        }

        dfs(node.left, depth+1, sums);
        dfs(node.right, depth+1, sums);

    }
}