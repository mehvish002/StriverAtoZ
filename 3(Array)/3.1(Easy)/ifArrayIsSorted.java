import java.util.Scanner;

public class ifArrayIsSorted{
    public static int isSorted(int n, int []a) {
        // Write your code here.
        int flag=0;
        for(int i=1;i<n;i++){
            if(a[i-1]>a[i]){
                flag=1;
                break;
            }
        }
        if(flag==1){
            return 0;
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(isSorted(n, arr));
    }
}
