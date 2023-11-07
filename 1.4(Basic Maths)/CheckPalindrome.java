import java.util.Scanner;

public class CheckPalindrome {
    static boolean isPalindrome(int x) {
        if(x<0)
        return false;
        if(x>=0 && x<10){
            return true;
        }
        int res=x;
        long rev=0;
        while(x!=0){
            int rem=x%10;
            rev=(rev*10)+rem;
            x/=10;
        }
        if(res==(int)rev)
        return true;

        return false;

        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(isPalindrome(n));
    }
    
}
