import java.util.*;
public class checkPalindrome {
    static boolean isPalindrome(String str) {
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        String rev=sb.toString();
        return rev.equals(str);
    }
    //recursive
    static String rev(String str,String ans){
        if(ans.length()==str.length())
        return ans;
        return rev(str, ans+str.charAt(str.length()-ans.length()-1));
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(isPalindrome(str));
        String reverse=rev(str, "");
        if(str.equals(reverse))
        System.out.println("true");
        else
        System.out.println("false");

    }
}
