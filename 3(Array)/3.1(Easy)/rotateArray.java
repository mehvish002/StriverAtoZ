//leetcode 189 

import java.util.Scanner;

public class rotateArray {
    static void reverse(int[] arr,int s,int e){
        while(s<=e){
            int tmp=arr[s];
            arr[s]=arr[e];
            arr[e]=tmp;
            s++;
            e--;
        }
    }
    static void rotate(int[] nums, int k) {
         k=k%nums.length;
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        rotate(arr, k);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    
}
