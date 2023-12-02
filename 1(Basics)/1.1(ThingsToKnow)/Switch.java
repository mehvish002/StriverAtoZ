import java.util.Scanner;

public class Switch {
    public static double areaSwitchCase(int ch, double []a) {
        switch(ch){
            case 1:
            return Math.PI*a[0]*a[0];
            case 2:
            return a[0]*a[1];
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ch=sc.nextInt();
        int n=sc.nextInt();
        double []a = new double [n];
        for (int i=0;i<n;i++){
            a[i]=sc.nextDouble();
        }
        System.out.println(areaSwitchCase(ch, a));
        }
    }
    

