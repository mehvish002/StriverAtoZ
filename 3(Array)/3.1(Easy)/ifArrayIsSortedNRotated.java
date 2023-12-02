//LeetCode 1752
import java.util.Scanner;

class ifArrayIsSortedNRotated {
    static boolean check(int[] nums) {
        int cnt=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]>nums[i])
            cnt++;
        }
        if(nums[nums.length-1]>nums[0])
        cnt++;


        if(cnt>1)
        return false;
        
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(check(arr));
    }
}