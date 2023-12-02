import java.util.*;
public class findHighestAndLowestFrequencyEle {
        public static int[] getFrequencies(int []v) {
            HashMap<Integer,Integer> map=new HashMap<>();
            for(int i=0;i<v.length;i++){
                int key=v[i];
                int freq=0;
                if(map.containsKey(key)){
                    freq=map.get(key);
                }
                freq++;
                map.put(key, freq);
            }
            int minEle=0,maxEle=0,maxFreq=0,minFreq=v.length;
            int min=v[0];
            for(Map.Entry<Integer,Integer> entry:map.entrySet()){
                int cnt=entry.getValue();
                int ele=entry.getKey();
                if(cnt>maxFreq){
                    maxEle=ele;
                    maxFreq=cnt;
                }
                if(cnt<minFreq){
                    minFreq=cnt;
                    minEle=ele;
                }
                if(cnt==minFreq){
                    minEle=(minEle<ele)?minEle:ele;
                }
                if(cnt==maxFreq){
                    maxEle=(maxEle<ele)?maxEle:ele;
                }
            }
        
            int[] ans=new int[2];
            ans[0]=maxEle;
            ans[1]=minEle;
            return ans;
            // Write Your Code Here
        }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int[] ans=getFrequencies(arr);
            for(int i:ans){
                System.out.print(i+" ");
            }
        }
    
}

