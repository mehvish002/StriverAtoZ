import java.util.HashMap;
import java.util.Scanner;

public class Countfrequency {
    public static int[] countFrequency(int n, int x, int []nums){
        // Write your code here.
        int[] arr=new int[n];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            int key=nums[i];
            int freq=0;
            if(map.containsKey(key)){
                freq=map.get(key);
            }
            freq++;
            map.put(key, freq);
        }
       
        for(int i=0;i<n;i++){
            if(map.containsKey(i+1)){
                arr[i]=map.get(i+1);
            }
            else{
                arr[i]=0;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int[] ans=countFrequency(n, x, arr);
        for(int i:ans){
            System.out.print(i+" ");
        }
    }
    
}
