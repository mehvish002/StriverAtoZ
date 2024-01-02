import java.util.*;

import javax.swing.tree.TreeCellRenderer;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val=val;
    }
}
public class maximumPathSum {
    static Scanner sc=new Scanner(System.in);
    static TreeNode create(){
        TreeNode nn=new TreeNode(sc.nextInt());
        boolean hlc=sc.nextBoolean();
        if(hlc==true){
            nn.left=create();
        }
        boolean hrc=sc.nextBoolean();
        if(hrc==true){
            nn.right=create();
        }
        return nn;
    }
    static int sum(TreeNode root,int[] max){
        if(root==null)
        return 0;
        int left=Math.max(0, sum(root.left,max));
        int right=Math.max(0, sum(root.right,max));
        max[0]=Math.max(max[0],left+right+root.val);
        return root.val+Math.max(left, right);
    }
    
    public static void main(String[] args) {
        TreeNode root=create();
        int[] max=new int[1];
        max[0]=Integer.MIN_VALUE;
        sum(root,max);
        System.out.println(max[0]);
    }
}
