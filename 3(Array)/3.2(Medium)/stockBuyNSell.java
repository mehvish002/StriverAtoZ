import java.util.Scanner;

public class stockBuyNSell {
    //if you are selling on ith day you buy it
    //on the minimum price from 1st-(ith-1) day
    
    //bruteforce O(n^2)
    static int bruteForceSol(int[] arr){
        int ans=0;
        for(int i=arr.length-1;i>=0;i--){
            int buy=arr[i];
            for(int j=i-1;j>=0;j--){
                buy=Math.min(buy,arr[j]);
            }
            ans=Math.max(ans,arr[i]-buy);
        }
        return ans;
    }
    //bruteforce O(n^2)
    static int bruteforceSol(int[] arr){
        int ans=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[i]){
                    ans=Math.max(ans, arr[j]-arr[i]);
                }
            }
        }
        return ans;
    }
    //optimal  O(n) time, O(1) space
    static int optimalSol(int[] arr){
        int minPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<arr.length;i++){
            minPrice=Math.min(minPrice,arr[i]);
            maxProfit=Math.max(maxProfit,arr[i]-minPrice);
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(bruteForceSol(arr));
        System.out.println(bruteforceSol(arr));
        System.out.println(optimalSol(arr));
    }
    
}
