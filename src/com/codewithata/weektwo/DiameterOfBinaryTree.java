package com.codewithata.weektwo;

public class DiameterOfBinaryTree {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
  private int diameter;
    public int diameterOfBinaryTree(TreeNode root) {
        diameter=0;
        maxDepth(root);
        return diameter;
    }

    private int maxDepth(TreeNode root){
        if(root==null)
            return 0;

        if(root.left==null&&root.right==null)
            return 1;

        int left=maxDepth(root.left);
        int right=maxDepth(root.right);

        diameter=Math.max(diameter,left+right);
        return 1+Math.max(left,right);
    }
}
