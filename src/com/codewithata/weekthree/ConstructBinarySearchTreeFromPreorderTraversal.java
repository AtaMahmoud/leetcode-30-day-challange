package com.codewithata.weekthree;

public class ConstructBinarySearchTreeFromPreorderTraversal {
    public class TreeNode {
      int val;
     TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode treeNode=null;
        for (int number : preorder) {
            TreeNode node=new TreeNode(number);
            if(treeNode==null){
                treeNode=node;
                continue;
            }
            addNode(treeNode,node);
        }
        return treeNode;
    }

    private void addNode(TreeNode root,TreeNode node){
        TreeNode current=root;
        while (true){
            if(node.val>current.val){
                if(current.right==null){
                    current.right=node;
                    break;
                }
                current=current.right;
            }else {
                if(current.left==null){
                    current.left=node;
                    break;
                }

                current=current.left;
            }
        }
    }
}
