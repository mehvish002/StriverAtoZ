import java.util.Scanner;

public class PrintNameNTimesUsingRecursion {
    public static void printNtimes(int n){
        if(n<1){
            return;
        }
        System.out.print("Coding Ninjas"+" ");
        printNtimes(n-1);
    }
 public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printNtimes(n);

 }   
}
