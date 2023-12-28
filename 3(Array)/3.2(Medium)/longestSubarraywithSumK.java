import java.util.Scanner;

public class longestSubarraywithSumK {
    static int sol(int[] arr,int k){
        int len=0;
        int s=0;
        int e=0;
        int sum=arr[0];
        while(e<arr.length){
            while(s<=e && sum>k){
                sum-=arr[s];
                s++;
            }
            if(sum==k)
            len=Math.max(e-s+1,len);

            e++;
            if(e<arr.length){
                sum+=arr[e];
            }
        }
        return len;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(sol(arr, k));

    }
}
