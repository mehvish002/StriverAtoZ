import java.util.ArrayList;
import java.util.Scanner;

public class rotateArrayByDPlacesToLeft {
    //bruteforce
    //O(n+k) time
    //O(k) space (extra array)
    static int[] rotateArray(int[] arr,int k){
        k=k%arr.length;
        int[] arr1=new int[k];
        for(int i=0;i<k;i++){
            arr1[i]=arr[i];
        }
        for(int i=k;i<arr.length;i++){
            arr[i-k]=arr[i];
        }
        int j=0;
        for(int i=arr.length-k;i<arr.length;i++){
            arr[i]=arr1[i-(arr.length-k)];
        }
        return arr;
    }

    //optimal
    //O(2n) time
    //O(1) space no extra space
    static void reverse(int[] arr,int s,int e){
        while(s<=e){
            int tmp=arr[s];
            arr[s]=arr[e];
            arr[e]=tmp;
            s++;
            e--;
        }
    }
    static int[] rotate(int[] arr,int k){
        k=k%arr.length;
        reverse(arr, 0, k-1);
        reverse(arr, k, arr.length-1);
        reverse(arr, 0, arr.length-1);
        return arr;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        //bruteforce
        //int[] ans=rotateArray(arr, k);

        //optimal
        int[] ans=rotate(arr, k);
        for(int i:ans){
            System.out.print(i+" ");
        }
    }
    
}

//coding ninjas
//     class Solution {
//     static void reverse(ArrayList<Integer> arr,int s,int e){
//         while(s<=e){
//             int tmp=arr.get(s);
//             arr.set(s,arr.get(e));
//             arr.set(e,tmp);
//             s++;
//             e--;
//         }
//     }
// 	public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
//         int n=arr.size();
//         k=k%n;
//         reverse(arr, 0,k-1);
//         reverse(arr, k,n-1);
//         reverse(arr, 0,n-1);

//         return arr;
//         // Write your code here.
//     }
// }