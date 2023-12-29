import java.util.Scanner;

public class SpiralMatrix {
    //O(N^2)time 
    //traversal: right,bottom,left,top
    static void spiral(int[][] arr){
        int top=0;
        int left=0;
        int bottom=arr.length-1;
        int right=arr[0].length-1;
        while(left<=right && top<=bottom){
            for(int i=left;i<=right;i++){
                System.out.print(arr[top][i]+" ");
            }
            top++;
            for(int i=top;i<=bottom;i++){
                System.out.print(arr[i][right]+" ");
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    System.out.print(arr[bottom][i]+" ");
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    System.out.print(arr[i][left]+" ");
                }
                left++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr=new int[n][m];
        for(int i=0;i<arr.length;i++){
           for(int j=0;j<arr[0].length;j++){
            arr[i][j]=sc.nextInt();
           } 
        }
        spiral(arr);
        

    }
}

//coding ninjas
// import java.util.*;
// public class Solution {
//     public static int[] spiralMatrix(int [][]MATRIX) {
//         int[] list=new int[MATRIX.length*MATRIX[0].length];
//         int cnt=0;
//         int left=0;
//         int top=0;
//         int right=MATRIX[0].length-1;
//         int bottom=MATRIX.length-1;
//         while(left<=right && top<=bottom){
//             for(int i=left;i<=right;i++){
//                 list[cnt]=MATRIX[top][i];
//                 cnt++;
//             }
//             top++;
//             for(int i=top;i<=bottom;i++){
//                 list[cnt]=MATRIX[i][right];
//                 cnt++;
//             }
//             right--;
//             if(top<=bottom){
//                 for(int i=right;i>=left;i--){
//                     list[cnt]=MATRIX[bottom][i];
//                     cnt++;
//                 }
//                 bottom--;
//             }
//             if(left<=right){
//                 for(int i=bottom;i>=top;i--){
//                     list[cnt]=MATRIX[i][left];
//                     cnt++;
//                 }
//                 left++;
//             }
//         }
//         return list;
//         // Write your code here.
//     }
// }