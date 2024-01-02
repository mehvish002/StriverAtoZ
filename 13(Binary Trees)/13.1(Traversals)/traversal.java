import java.util.*;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int data){
        this.val=data;
    }
}
public class traversal{
    static void preorder(TreeNode root){
        if(root ==null)
        return;

        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }
    static void inOrder(TreeNode root){
            if(root==null)
            return;
            inOrder(root.left);
            System.out.print(root.val+" ");
            inOrder(root.right);
        
    }
    static void post(TreeNode root){
        if(root==null)
        return;
        post(root.left);
        post(root.right);
        System.out.print(root.val+" ");
    }
     static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null)
        return ans;
        q.add(root);
        while(!q.isEmpty()){
            int x=q.size();
            List<Integer> list=new ArrayList<>();
            for(int i=0;i<x;i++){
                if(q.peek().left!=null){
                    q.add(q.peek().left);
                }
                if(q.peek().right!=null){
                    q.add(q.peek().right);
                }
                list.add(q.poll().val);
            }
            ans.add(list);
        }
        return ans;
    }
    static void iterativePre(TreeNode root){
        if(root==null)
        return;
        Stack<TreeNode> st=new Stack<>();
        st.push(root);
        while(!st.isEmpty()){
            TreeNode r=st.pop();
            System.out.print(r.val+" ");
            if(r.right!=null){
                st.push(r.right);
            }
            if(r.left!=null){
                st.push(r.left);
            }
        }
    }
    static List<Integer> iterativeInOrder(TreeNode root){
        List<Integer> list=new ArrayList<>();
        if(root==null)
        return list;
        Stack<TreeNode> st=new Stack<>();
        TreeNode nn=root;
        while(!st.isEmpty() || nn!=null){
            if(nn!=null){
                st.push(nn);
                nn=nn.left;
            }
            else{
                nn=st.pop();
                list.add(nn.val);
                nn=nn.right;
            }
        }
        return list;
    }
    static ArrayList<Integer> iterativePostOrderUsingTwoStacks(TreeNode root){
        Stack<TreeNode> st1=new Stack<>();
        Stack<TreeNode> st2=new Stack<>();
        ArrayList<Integer> list=new ArrayList<>();
        if(root==null)
        return list;
        st1.push(root);
        while(!st1.isEmpty()){
            TreeNode nn=st1.pop(); 
            st2.push(nn);
            if(nn.left!=null)
            st1.push(nn.left);
            if(nn.right!=null)
            st1.push(nn.right);
        }
        while(st2.isEmpty()==false){
            list.add(st2.pop().val);
        }
        return list;
    }
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
    public static void main(String[] args) {
        TreeNode root=create();
        preorder(root);
        System.out.println();
        inOrder(root);
        System.out.println();;
        post(root);
        System.out.println();
        List<List<Integer>> level=levelOrder(root);
        System.out.println(level);
        iterativePre(root);
        System.out.println();
        List<Integer>in=iterativeInOrder(root);
        System.out.println(in);
        ArrayList<Integer>post=iterativePostOrderUsingTwoStacks(root);
        System.out.println(post);
        
    }
    
}
//3 true 9 false false true 20 true 15 false false true 7 false false