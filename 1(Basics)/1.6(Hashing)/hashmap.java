import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class hashmap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            int key=arr[i];
            int freq=0;
            if(map.containsKey(key)){
                freq=map.get(key);
            }
            freq++;
            map.put(key, freq);
        }
        //iterate over map:
        for(Map.Entry<Integer,Integer> it:map.entrySet()){
            System.out.println(it.getKey()+"->"+it.getValue());
        }

        int q=sc.nextInt();
        for(int i=0;i<q;i++){
            int num;
            num=sc.nextInt();
            if (map.containsKey(num)){
                System.out.println(map.get(num));
            }
            else{
                System.out.println(0);
            }
        }
    }
    
}
