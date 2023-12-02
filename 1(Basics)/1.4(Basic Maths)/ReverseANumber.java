import java.util.Scanner;

public class ReverseANumber {
    static int reverse(int n){
        long rev=0;
        while(n!=0){
            int rem=n%10;
            rev=(rev*10)+rem;
            n/=10;
        }
        if(rev > Integer.MAX_VALUE || rev<Integer.MIN_VALUE){
            return 0;
        }
        return (int)rev;
    }
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(reverse(n));
    }    
}
