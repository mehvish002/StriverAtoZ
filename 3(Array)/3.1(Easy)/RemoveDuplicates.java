//LeetCode 26
import java.util.Scanner;

public class RemoveDuplicates {
    static int removeDuplicates(int[] nums) {
        int n=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                nums[n]=nums[i+1];
                n++;
            }
        }
        return n;
       
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(removeDuplicates(arr));
    }
    
}
