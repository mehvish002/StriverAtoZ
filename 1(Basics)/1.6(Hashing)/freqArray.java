import java.util.Scanner;

public class freqArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int[] freq=new int[13];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        int q=sc.nextInt();
        for(int i=0;i<q;i++){
            int num;
            num=sc.nextInt();
            System.out.println(freq[num]);
        }
    }
    
}
