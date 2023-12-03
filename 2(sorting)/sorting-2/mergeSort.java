//divide and merge
import java.util.*;
public class mergeSort {
    //divide
    static void mergesort(int[] arr,int low,int high){
        if(low>=high)
        return;

        int mid=(low+high)/2;
        mergesort(arr, low, mid);
        mergesort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    //merge
    static void merge(int[] arr,int low,int mid,int high){
        ArrayList<Integer> list=new ArrayList<>();
        int left=low;
        int right=mid+1;
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                list.add(arr[left]);
                left++;
            }
            else{
                list.add(arr[right]);
                right++;
            }
        }
        while(left<=mid){
            list.add(arr[left]);
            left++;
        }
        while(right<=high){
            list.add(arr[right]);
            right++;
        }
       // int[] ans=new int[list.size()];
        for(int i=low;i<=high;i++){
            arr[i]=list.get(i-low);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        mergesort(arr,0,n-1);
        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        
    }   
    
}
