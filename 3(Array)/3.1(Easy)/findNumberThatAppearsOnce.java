import java.util.Scanner;

public class findNumberThatAppearsOnce {
    public static int singleNumber(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            ans ^=nums[i];
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
        System.out.println(singleNumber(arr));
      }
    
}
