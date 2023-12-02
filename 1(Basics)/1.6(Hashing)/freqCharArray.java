import java.util.Scanner;

public class freqCharArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char[] arr=new char[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.next().charAt(0);
         }
        // for(char ch:arr){
        //     System.out.print(ch);
        // }
        int[] freq=new int[256];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        int q=sc.nextInt();
        for (int i=0;i<q;i++) {
            char ch;
            ch=sc.next().charAt(0);
            System.out.println(freq[ch]);
        }
    }
    
}
