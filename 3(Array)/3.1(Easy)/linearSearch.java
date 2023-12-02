import java.util.Scanner;

public class linearSearch {
    public static int Search(int n, int num, int []arr){
        // Write your code here.
        int idx=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==num){
                idx=i;
                break;
            }
        }
        return idx;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(Search(n, num, arr));
    }    
}
