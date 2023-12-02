import java.util.*;
public class InputOutput {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        if(ch>='a' && ch<='z'){
            System.out.print("0");
        }
        else if(ch>='A' && ch<='Z'){
            System.out.print("1");
        }
        else{
            System.out.print("-1");
        }
    }
}