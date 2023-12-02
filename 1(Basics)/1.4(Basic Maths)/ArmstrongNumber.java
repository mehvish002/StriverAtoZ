import java.util.*;
public class ArmstrongNumber {
	static int length(int n){
		int cnt=0;
		while(n!=0){
			cnt++;
			n/=10;
		}
		return cnt;
	}
	static boolean isArmstrong(int n){
		int len=length(n);
		int res=n;
		int sum=0;
		while(n!=0){
			int rem=n%10;
			sum+=Math.pow(rem,len);
			n/=10;
		}
		if(sum==res)
		return true;

		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(isArmstrong(n));


	}
}
