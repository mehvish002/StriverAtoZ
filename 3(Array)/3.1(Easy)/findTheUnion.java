import java.util.*;

public class findTheUnion {
    public static List< Integer > sortedArray(int []a, int []b) {
        List<Integer> list=new ArrayList<>();
        LinkedHashSet<Integer> set=new LinkedHashSet<>();
        for(int i=0;i<a.length;i++){
            set.add(a[i]);
        }
        for(int i=0;i<b.length;i++){
            set.add(b[i]);
        }
        for(int i:set){
            list.add(i);
        }
        Collections.sort(list);
        return list;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] arrA=new int[n];
        int[] arrB=new int[m];
        for(int i=0;i<n;i++){
            arrA[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++){
            arrB[i]=sc.nextInt();
        }
        List<Integer> list=sortedArray(arrA, arrB);
        System.out.println(list);
    }
    
}
