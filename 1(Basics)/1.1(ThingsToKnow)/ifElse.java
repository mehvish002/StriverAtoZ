import java.util.Scanner;

public class ifElse {
    public static String compareIfElse(int a, int b) {
        if(a>b){
            return "greater";
        }
        else if(a<b){
            return "smaller";
        }
        return "equal";
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(compareIfElse(a, b));
    }
    
}
