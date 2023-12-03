//it pushes the maximum to the last
//adjacent swapping
//O(n^2)
//O(n)best if already sorted
//(n-1) iterations

//example of the algo:
//input: 13,46,24,52,20,9
//1st: 13,24,46,20,9,52
//2nd: 13,24,20,9,46,52
//3rd: 13,20,9,24,46,52
//4th: 13,9,20,24,46,52
//5th: 9,13,20,24,46,52

import java.util.*;
public class bubbleSort {
    static void sort(int[] arr){
        for(int i=arr.length-1;i>=0;i--){
            int didSwap=0;
            for(int j=0;j<=i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    didSwap=1;
                }
            }
            if(didSwap==0)
            break;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }   
}
