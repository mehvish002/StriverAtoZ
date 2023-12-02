import java.util.Scanner;

public class findMissingNumber {
    public static int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=n*(n+1)/2;
        for(int i=0;i<n;i++){
            sum-=nums[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(missingNumber(arr));
    }
    
}
