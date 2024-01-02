import java.util.*;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val=val;
    }
}
public class checkIfTwoTreesAreIdentical {
    static Scanner sc=new Scanner(System.in);
    static TreeNode create(){
        TreeNode nn=new TreeNode(sc.nextInt());
        boolean hlc=sc.nextBoolean();
        if(hlc)
        nn.left=create();
        boolean hrc=sc.nextBoolean();
        if(hrc)
        nn.right=create();
        return nn;
    }
    static boolean isSame(TreeNode root1,TreeNode root2){
        if(root1==null || root2==null){
            return (root1==root2);
        }
        return root1.val==root2.val && isSame(root1.left, root2.left) && isSame(root1.right, root2.right);
    }
    public static void main(String[] args) {
        TreeNode root1=create();
        TreeNode root2=create();
        System.out.println(isSame(root1, root2));
        
        
    }
    
}
//1 true 2 false false true 3 true 4 false false true 5 false false
//1 true 2 false false true 3 true 4 false false true 5 false false