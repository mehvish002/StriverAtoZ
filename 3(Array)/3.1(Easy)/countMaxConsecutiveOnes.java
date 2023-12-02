import java.util.Scanner;

public class countMaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int cnt=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                cnt++;
            }
            else{
                max=(max<cnt)?cnt:max;
                cnt=0;
            }
        }
        max=(max<cnt)?cnt:max;
        return max;
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(findMaxConsecutiveOnes(arr));
    }
}
