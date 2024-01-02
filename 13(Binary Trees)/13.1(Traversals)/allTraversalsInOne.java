import java.util.*;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int data){
        this.val=data;
    }
}
class Pair{
    TreeNode node;
    int num;
    Pair(TreeNode node,int num){
        this.node=node;
        this.num=num;
    }
}
public class allTraversalsInOne {
    static void allTraversals(TreeNode root,ArrayList<Integer> pre,ArrayList<Integer> in,ArrayList<Integer> post){
        Stack<Pair> st=new Stack<>();
        st.push(new Pair(root,1));
        if(root==null)
        return;
        while(!st.isEmpty()){
            Pair curr=st.pop();
            if(curr.num==1){
                pre.add(curr.node.val);
                curr.num++;
                st.push(curr);
                if(curr.node.left!=null){
                    st.push(new Pair(curr.node.left,1));
                }
            }
            else if(curr.num==2){
                in.add(curr.node.val);
                curr.num++;
                st.push(curr);
                if(curr.node.right!=null){
                    st.push(new Pair(curr.node.right,1));
                }
            }
            else{
                post.add(curr.node.val);
            }
        }
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
        ArrayList<Integer> pre=new ArrayList<>();
        ArrayList<Integer> in=new ArrayList<>();
        ArrayList<Integer> post=new ArrayList<>();
        allTraversals(root, pre, in, post);
        System.out.println(pre);
        System.out.println(in);
        System.out.println(post);
    }
    
}
