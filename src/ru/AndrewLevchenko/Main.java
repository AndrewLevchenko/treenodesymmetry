package ru.AndrewLevchenko;

public class Main {

    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(){}

        TreeNode(int val){
        this.val=val;}

        TreeNode(int val, TreeNode left,TreeNode right){
            this.val=val;
            this.left=left;
            this.right=right;
        }

        public boolean isSymmetric(){
            if (left.val== right.val && inInnerSymmetric(left,right)) return true;
            return false;
        }
    }

    public static boolean inInnerSymmetric(TreeNode left_root,TreeNode right_root){
        if (left_root==null && right_root==null) return true;
        if (left_root==null || right_root==null) return false;
        if (left_root.val==right_root.val && inInnerSymmetric(left_root.left,right_root.right) && inInnerSymmetric(right_root.left,left_root.right)) return true;
        return false;
    }

    public static void main(String[] args) {

	TreeNode third_1=new TreeNode(1,new TreeNode(4),new TreeNode(5));
	TreeNode third_2=new TreeNode(3);
	TreeNode third_3=new TreeNode(3);
	TreeNode third_4=new TreeNode(1,new TreeNode(5),new TreeNode(4));
	TreeNode second_1=new TreeNode(4,third_1,third_2);
	TreeNode second_2=new TreeNode(4,third_3,third_4);
	TreeNode first=new TreeNode(5,second_1,second_2);
        System.out.println(first.isSymmetric());
    }
}
