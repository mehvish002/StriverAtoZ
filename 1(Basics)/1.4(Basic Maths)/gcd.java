import java.util.Scanner;

public class gcd {
    static int gcd(int n,int m){
        int min=Math.min(n, m);
        int ans=0;
        for (int i=1;i<=min;i++){
            if(n%i==0 && m%i==0){
                ans=i;
            }
    }
    return ans;
}
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int m=sc.nextInt();
   System.out.println(gcd(n, m));

}
}
