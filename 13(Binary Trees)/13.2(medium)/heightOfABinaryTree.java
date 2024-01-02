import java.util.*;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int data){
        this.val=data;
    }
}
public class heightOfABinaryTree {
    static int height(TreeNode root){
        if(root==null)
        return 0;
        int left=height(root.left);
        int right=height(root.right);
        return 1+Math.max(left, right);

    }
    static Scanner sc=new Scanner(System.in);
    static TreeNode createTree(){
        TreeNode nn=new TreeNode(sc.nextInt());
        boolean hlc=sc.nextBoolean(); //hasLeftChild
        if(hlc==true){
            nn.left=createTree();
        }
        boolean hrc=sc.nextBoolean(); //hasRightChild
        if(hrc==true){
            nn.right=createTree();
        }
        return nn;

    }
    public static void main(String[] args) {
        TreeNode root=createTree();
        System.out.println(height(root));
    }
}
//3 true 9 false false true 20 true 15 false false true 7 false false