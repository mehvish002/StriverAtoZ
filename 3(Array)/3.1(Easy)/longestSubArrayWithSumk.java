import java.util.*;
public class longestSubArrayWithSumk {
    //bruteforce O(n^3)
    // static int sol(int[] arr,int target){
    //     int n=arr.length;
    //     int ans=0;
    //     for(int i=0;i<n;i++){
    //         int sum=0;
    //         for(int j=i; j<arr.length;j++) {
    //             for(int k=i;k<j;k++){
    //                 sum+=arr[k];
    //             }
    //             if(sum==target){
    //                 ans=Math.max(ans,i-j+1);
    //             }
    //         }
    //     }
    //     return ans;
    // }

    //O(n^2)
    //static int sol(int[] arr,int target){
    //     int n=arr.length;
    //     int ans=0;
    //     for(int i=0;i<n;i++){
    //         int sum=0;
    //         for(int j=i; j<arr.length;j++) {
    //                 sum+=arr[j];
    //             if(sum==target){
    //                 ans=Math.max(ans,i-j+1);
    //             }
    //         }
    //     }
    //     return ans;
    // }


    //better --> hashing
    //if there exist a subaaray with sum k as (.) as the last element
    //O(nlogn) time
    //O(n) space 
    // static int sol(int[] arr,int k){
    //     HashMap<Integer,Integer> map=new HashMap<>();
    //     int maxLen=0;
    //     int sum=0;
    //     for (int i=0;i<arr.length; i++){
    //         sum+=arr[i];
    //         if(sum==k){
    //             maxLen=Math.max(i+1,maxLen);
    //         }
    //         int rem=sum-k;
    //         if(map.containsKey(rem)){
    //             int len=i-map.get(rem);
    //             maxLen=Math.max(maxLen, len);
    //         }
    //         if(!map.containsKey(sum)){
    //             map.put(sum,i);
    //         }
    //     }

    //     return maxLen;
    // }

    //optimal --> 2 pointer
    //O(2n)==O(n) time
    //O(1) space
    static int sol(int[] arr,int k){
        int i=0;
        int j=0;
        int sum=arr[0];
        int len=0;
        while(i<arr.length){
            // if sum > k, reduce the subarray from left
            // until sum becomes less or equal to k:
            while(j<=i && sum>k){
                sum-=arr[j];
                j++;
            }
            // if sum = k, update the len i.e. answer:
            if(sum==k){
                len=Math.max(len,i-j+1);
            }
            // Move forward thw right pointer:
            i++;
            if(i<arr.length)
            sum+=arr[i];
        }
        return len;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(sol(arr, k));
    }
}
