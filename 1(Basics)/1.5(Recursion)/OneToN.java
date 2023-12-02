import java.util.*;
public class OneToN {
    static void display(int x,int i,int[] arr){
        if(i<1){
            return;
        }
        display(x,i-1,arr);
        arr[i-1]=i;
    }
    public static int[] printNos(int x) {
        int[] arr=new int[x];
        display(x, x,arr);
       
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=printNos(n);
        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}