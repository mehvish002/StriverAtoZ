import java.util.*;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int data){
        this.val=data;
    }
}
public class diameterOfABinaryTree {
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
    static int height(TreeNode root,int[] max){
        if(root==null)
        return 0;
        int left=height(root.left,max);
        int right=height(root.right,max);
        max[0]=Math.max(max[0], left+right);
        return 1+Math.max(left, right);

    }
    static int diameter(TreeNode root){
        int max[] = new int[1];
        int x= height(root, max);
        return max[0];
    }
    public static void main(String[] args) {
        TreeNode root=createTree();
        System.out.println(diameter(root));
        
    }
    
}
//1 true 2 false false true 3 true 4 true 5 true 9 false false false false true 6 false true 7 false true 8 false false
