import java.util.*;

public class LeadersInArray {
    static ArrayList<Integer> leaders(int[] arr){
        int n=arr.length;
        int max=arr[n-1];
        ArrayList<Integer> list=new ArrayList<>();
        list.add(max);
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>max){
                list.add(arr[i]);
                max=arr[i];
            }
        }
        Collections.reverse(list);
        return list;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        ArrayList<Integer> list=leaders(arr);
        for(int i:list){
            System.out.print(i+" ");
        }
    }
}

//coding ninjas
// import java.util.*;
// public class Solution {
//     public static List< Integer > superiorElements(int []a) {
//         List<Integer> ans=new ArrayList<>();
//         int max=a[a.length-1];
//         ans.add(max);
//         for(int i=a.length-1;i>=0;i--){
//             if(a[i]>max){
//                 ans.add(a[i]);
//                 max=a[i];
//             }
//         }
//         Collections.sort(ans);
//         return ans;
//         // Write your code here.
//     }
// }
