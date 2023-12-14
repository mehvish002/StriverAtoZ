//leetCode 283
import java.util.Scanner;
public class moveZeroesToEnd {
    //bruteforce
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

    //optimal
    static void move(int[] nums){
        int j=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                j=i;
                break;
            }
        }
        if(j==-1)
        return;

        for(int i=j+1;i<nums.length;i++){
            if(nums[i]!=0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        // moveZeroes(arr);
        // for (int i : arr) {
        //     System.out.print(i+" ");
        // }
        
        //optimal
        move(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
    
}
