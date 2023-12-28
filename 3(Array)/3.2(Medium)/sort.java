import java.util.Scanner;

public class sort {
    static void sol(int[] arr){
        int left=0;
        int mid=0;
        int right=arr.length-1;
        while(mid<=right){
            if(arr[mid]==0){
                int tmp=arr[mid];
                arr[mid]=arr[left];
                arr[left]=tmp;
                left++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                int tmp=arr[right];
                arr[right]=arr[mid];
                arr[mid]=tmp;
                right--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sol(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    
}
