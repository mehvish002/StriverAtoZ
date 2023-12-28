import java.util.*;

public class rearrangeTheArrayInAlternatingItems {
    //bruteForce O(n+n/2) time, O(n/2+n/2)==O(n) space
    static int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();
        int[] ans=new int[nums.length];
        for(int i:nums){
            if(i>0)
            pos.add(i);
            else
            neg.add(i);
        }
        int cnt=0;
        for(int i=0;i<nums.length/2;i++){
            ans[2*i]=pos.get(i);
            ans[2*i+1]=neg.get(i);
            cnt++;
        }
        return ans;
    }
    //optimal O(N) time, O(N) space
    static int[] alternateNumbers(int []a) {
        // Write your code here.
        int[] ans=new int[a.length];
        int pos=0;
        int neg=1;
        for(int i=0;i<a.length;i++){
            if(a[i]>0){
                ans[pos]=a[i];
                pos+=2;
            }
            else{
                ans[neg]=a[i];
                neg+=2;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        // int[] ans=rearrangeArray(arr);
        int[] ans=alternateNumbers(arr);
        for(int i:ans)
        System.out.print(i+" ");
    }
}
