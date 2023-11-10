import java.util.*;
public class reverseArray {
    static int[] reverse(int n, int []nums) {
        int st=0;
        int en=n-1;
        while(st<=en){
            int temp=nums[st];
            nums[st]=nums[en];
            nums[en]=temp;
            st++;
            en--;
        }
        return nums;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        arr=reverse(n,arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
