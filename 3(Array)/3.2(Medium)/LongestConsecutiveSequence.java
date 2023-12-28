import java.util.*;

public class LongestConsecutiveSequence {
    static boolean linearSearch(int[] arr,int num){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num)
                return true;
        }
        return false;
    }
    //bruteForce: o(n^2)
    static int bruteForce(int[] arr){
        int len=1;
        for(int i=0;i<arr.length;i++){
            int x=arr[i];
            int cnt=1;
           while(linearSearch(arr,x+1)==true){
                    cnt++;
                    x++;
                }
            len=Math.max(len,cnt);
        }
        return len;
    }
    //better O(N*logN)+O(N)
    static int better(int[] arr){
        Arrays.sort(arr);
        int len=1;
        int lastSmallest=Integer.MIN_VALUE;
        int cnt=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==lastSmallest+1){
                cnt++;
                lastSmallest=arr[i];
            }
            else if(arr[i]!=lastSmallest){
                cnt=1;
                lastSmallest=arr[i];
            }
            len=Math.max(cnt,len);
        }
        return len;
    }
    //optimal: O(N)Time  O(N)space  
    static int optimal(int[] arr){
        if(arr.length==0)
        return 0;
        int len=1;
        HashSet<Integer> set=new HashSet<>();
        for(int i:arr)
        set.add(i);
        for(int i:set){
            if(!set.contains(i-1)){
                int cnt=1;
                int x=i;
                while(set.contains(x+1)){
                    x+=1;
                    cnt+=1;
                }
                len=Math.max(cnt, len);
            }
        }
        return len;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(bruteForce(arr));
        System.out.println(better(arr));
        System.out.println(optimal(arr));
    }
}
