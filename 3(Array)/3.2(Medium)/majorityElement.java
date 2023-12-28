import java.util.*;
public class majorityElement {

    //better
    //O(nlogn)+O(n) time
    //O(n) space

    //  public int majEle(int[] nums) {
    //     HashMap<Integer,Integer> map=new HashMap<>();
    //     for(int i:nums){
    //         if(map.containsKey(i)){
    //             map.put(i,map.get(i)+1);
    //         }
    //         else{
    //             map.put(i,1);
    //         }
    //     }        
    //     int key=0;
    //     for(int i:map.keySet()){
    //         if(map.get(i)>nums.length/2){
    //             key=i;
    //         }
    //     }
    //     return key;
    // }

    
    //optimal ---> moore's voting algo
    //O(n)+O(n)=O(2n)=O(n) time
    //O(1) space
    static int majEle(int[] arr){
        int ele=0;  //2
        int cnt=0;  //1
        for(int i: arr){
            if(cnt==0){
                ele=i;
                cnt=1;
            }
            else if(i==ele){
                cnt++;
            }
            else{
                cnt--;
            }
        }
        //to check if ele we got is majority or not
        int cnt1=0;
        for(int i:arr){
            if(i==ele){
                cnt1++;
            }
        }
        if(cnt1>arr.length/2)
        return ele;

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(majEle(arr));
    }
}