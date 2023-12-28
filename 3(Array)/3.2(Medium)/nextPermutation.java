import java.util.*;
public class nextPermutation {
    public static void nextPerm(int[] arr){
        int pos1=0,pos2=0;
        boolean lexo=true;
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                lexo=false;
                pos1=i;
                break;
            }
        }
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>arr[pos1]){
                pos2=i;
                break;
            }
        }
        if(lexo){
            Arrays.sort(arr,0,arr.length);
            return;
        }
        int tmp=arr[pos1];
        arr[pos1]=arr[pos2];
        arr[pos2]=tmp;
        Arrays.sort(arr,pos1+1,arr.length);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        nextPerm(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    
}

//coding ninjas
// import java.util.*;
// public class Solution {
//     public static List< Integer > nextGreaterPermutation(List< Integer > A) {
//         // Write your code here.
//         int n=A.size();
//         int pos1=0;
//         int pos2=0;
//         boolean lexo=true;
//         for(int i=A.size()-2;i>=0;i--){
//             if(A.get(i)<A.get(i+1)){
//                 pos1=i;
//                 lexo=false;
//                 break;
//             }
//         }
//         for(int i=A.size()-1;i>=0;i--){
//             if(A.get(i)>A.get(pos1)){
//                 pos2=i;
//                 break;
//             }
//         }
//         if(lexo){
//             Collections.sort(A);
//             return A;
//         }
//         int tmp=A.get(pos1);
//         A.set(pos1,A.get(pos2));
//         A.set(pos2,tmp);
        
//         List<Integer> sublist =A.subList(pos1+1, n);
//         Collections.reverse(sublist);

//         return A;



//     }
// }
