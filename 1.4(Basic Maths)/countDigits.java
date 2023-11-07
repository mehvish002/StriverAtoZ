import java.util.*;
public class countDigits {
    static int count(int n){
        int cnt=0;
        int res=n;
        while(n>0){
            int rem=n%10;
            if(rem!=0){
            if(res%rem==0){
                cnt++;
            }
            }
            n/=10;
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(count(n));
    }
}