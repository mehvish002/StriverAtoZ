import java.util.Scanner;

public class leftRotateByOnePlace {
    static int[] rotateArray(int[] arr, int n) {
        // Write your code here.
        int tmp=arr[0];
        for(int i=1;i<n;i++){
            arr[i-1]=arr[i];
        }
        arr[n-1]=tmp;

        return arr;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int[] ans=rotateArray(arr, n);
        for(int i:ans){
            System.out.print(i+" ");
        }
    }
    
}
