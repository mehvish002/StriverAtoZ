import java.util.*;

public class TwoSum {
    static int[] sol(int[] nums,int k){
        int[] ans=new int[2];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            int moreNeeded=k-num;
            if(map.containsKey(moreNeeded)){
                ans[0]=map.get(moreNeeded);
                ans[1]=i;
            }
            map.put(num,i);
        }
        return ans;
    }
    //codding Ninjas
    // public static String read(int n, int []book, int target){
    //     HashMap<Integer,Integer> map=new HashMap<>();
    //     for(int i=0;i<n;i++){
    //         int num=book[i];
    //         int moreNeeded=target-num;
    //         if(map.containsKey(moreNeeded)){
    //             return "YES";
    //         }
    //         map.put(num,i);
    //     }
    //     return "NO";
    //     // Write your code here.
    // }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int[] ans=sol(arr, k);
        for(int i:ans){
            System.out.print(i+" ");
        }
    }
}
