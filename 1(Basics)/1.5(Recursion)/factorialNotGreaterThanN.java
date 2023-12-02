import java.util.*;
public class factorialNotGreaterThanN {
    static void res(ArrayList<Long> list,long n,long fact,int i){
        if(fact>n){
            return ;
        }
        list.add(fact);
        i++;
        fact=fact*i;
        res(list, n,fact,i);
    
    }
    public static List<Long> factorialNumbers(long n) {
        ArrayList<Long> list=new ArrayList<>();
        long fact=1;
        int i=1;
        res(list, n, fact, i);
        return list;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextInt();
        List<Long> list=factorialNumbers(n);
        for(long i:list){
            System.out.print(i+" ");
        }
    }
}