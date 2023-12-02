import java.util.Scanner;

public class SumOfFirstNNumbers {
    static int sum(int n,int res){
        if(n<1){
            return res;
        }
        res+=n;
        return sum(n-1, res);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sum(n, 0));

    }
}
