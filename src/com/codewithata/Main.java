package com.codewithata;
import com.codewithata.weekthree.ConstructBinarySearchTreeFromPreorderTraversal;

public class Main {

    public static void main(String[] args) {
        int [] gird={8,5,1,7,10,12};
        ConstructBinarySearchTreeFromPreorderTraversal cbspt=new ConstructBinarySearchTreeFromPreorderTraversal();
       ConstructBinarySearchTreeFromPreorderTraversal.TreeNode result=cbspt.bstFromPreorder(gird);

    }
}
