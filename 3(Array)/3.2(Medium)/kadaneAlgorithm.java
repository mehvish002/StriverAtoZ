import java.util.Scanner;

public class kadaneAlgorithm {
    //bruteForce O(n^3) time,O(1) space
    // 2 loops to make subaaray and 1 to find sum
    //for(i=0-->n),for(j=0-->n),for(k=i-->j)
    static int bruteForceSol(int[] arr,int n){
        int max=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                }
                max=Math.max(max, sum);
            }
        }
        return max;
    }
    //better O(n^2) time, O(1) space
    //2 loops calulate sum long with increasing j
    static int betterSol(int[] arr,int n){
        int max=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                max=Math.max(max, sum);
            }
        }
        return max;
    }
    //optimal ---> Kadane's Algorithm(used to find maxinmum subarray sum) 
    //O(n) time, O(1) space
    static int kadane(int[] arr){
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i:arr){
            sum+=i;
            max=Math.max(max, sum);
            if(sum<0)
            sum=0;
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(bruteForceSol(arr,n));
        System.out.println(betterSol(arr,n));
        System.out.println(kadane(arr));
    }
    
}

//coding ninjas
// public static long maxSubarraySum(int[] arr, int n) {
// 		long sum=0;
// 		long max=Long.MIN_VALUE;  //-4
// 		for(int i:arr){
// 			sum+=i;
// 			max=Math.max(sum, max);
// 			if(sum<0)
// 			sum=0;
// 		}
// 		return Math.max(max,0);

// 		// write your code here
// 	}

