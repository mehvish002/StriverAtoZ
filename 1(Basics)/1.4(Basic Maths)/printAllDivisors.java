import java.util.Scanner;

public class printAllDivisors {
    static int sumOfDivisors(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            int res=(sumOfDivisors(i));
            sum+=res;
        }
        System.out.println(sum);
    }
    
}
