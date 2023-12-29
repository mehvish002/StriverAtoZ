import java.util.*;
public class rotateMatrixby90Degree {
    //bruteforce: O(N^2)time O(N^2)space
    static int[][] bruteForce(int[][] arr){
        // int n=arr.length;
        int[][] ans=new int[arr.length][arr[0].length];
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[0].length;j++){
                ans[j][ans[0].length-1-i]=arr[i][j];
            }
        }
        return ans;
    }
    //optimal O(N^2)time O(1)space
    //transpose the matrix and reverse every row

    static void optimal(int[][] arr){
        //tranpose
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr[0].length;j++){
                int tmp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=tmp;
            }
        }
        //reverse
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length/2;j++){
                int tmp=arr[i][j];
                arr[i][j]=arr[i][arr.length-1-j];
                arr[i][arr.length-1-j]=tmp;
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println();
        int[][] ans=bruteForce(arr);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
               System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        optimal(arr);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
               System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}