import java.util.Scanner;

public class CheckPrime {
    public static String isPrime(int num) {
		if(num==1)
		return "NO";
		int cnt=0;
		for(int i=1;i*i<=num;i++){
			if(num%i==0){
				cnt++;
			}
		}
		if(cnt>1)
		return "NO";

		return "YES";
		//Your code goes here
	}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int cnt=0;
        System.out.println(isPrime(n));
    }
    
}
