import java.util.*;
public class SecondLargestNSmallest{
    static int secondSmallest(int n,int[] arr){
        int small=Integer.MAX_VALUE;
        int second_small=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<small){
                second_small=small;
                small=arr[i];
            }
            else if(arr[i]<second_small && arr[i]!=small){
                second_small=arr[i];
            }
        }
            return second_small;
    }
    static int secondLargest(int n,int[] arr){
        int large=Integer.MIN_VALUE;
        int second_large=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>large){
                second_large=large;
                large=arr[i];
            }
            else if(arr[i]>second_large && arr[i]!=large){
                second_large=arr[i];
            }
        }
            return second_large;
    }
    public static int[] getSecondOrderElements(int n, int []a) {
        int[] arr=new int[2];
        arr[0]=secondLargest(n, a);
        arr[1]=secondSmallest(n, a);

        return arr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] ans=getSecondOrderElements(n, arr);
        for(int i:ans){
            System.out.println(i);
        }
    }
}