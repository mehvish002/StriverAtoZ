//leetCode 283
import java.util.Scanner;
public class moveZeroesToEnd {
    public static void moveZeroes(int[] nums) {
        int[] arr=new int[nums.length];
        int idx=0;
        for(int i:nums){
            if(i!=0){
                arr[idx]=i;
                idx++;
            }
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=arr[i];
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        moveZeroes(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
    
}
