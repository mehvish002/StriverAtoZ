import java.util.Scanner;

public class setMatrixZero {
    static void markRow(int[][] arr,int n,int m,int i){
        for(int j=0;j<m;j++){
            if(arr[i][j]!=0){
                arr[i][j]=-1;
            }
        }
    }
    static void markCol(int[][] arr,int n,int m,int j){
        for(int i=0;i<n;i++){
            if(arr[i][j]!=0){
                arr[i][j]=-1;
            }
        }
    }
    //bruteForce O(n*m)*(n+m)+O(n*m) === O(N^3)
    static void bruteForce(int[][] arr,int n,int m){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==0){
                    markRow(arr,n,m,i);
                    markCol(arr,n,m,j);
                }

            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==-1)
                arr[i][j]=0;
            }
        }
    }

    //better  O(N*M)time O(N)+O(M)space
    static void better(int[][] arr,int n,int m){
        int[] row=new int[n];
        int[] col=new int[m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==0){
                    row[i]=1;
                    col[j]=1;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(row[i]==1 || col[j]==1){
                    arr[i][j]=0;
                }
            }
        }
    }

    //optimal O(2(N*M))===O(N^2)time O(1)space
    static void optimal(int[][] arr,int n,int m){
        int col0=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==0){
                    arr[i][0]=0;
                    if(j!=0){
                        arr[0][j]=0;
                    }
                    else
                    col0=0;
                }
            }
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(arr[i][j]!=0){
                    if(arr[i][0]==0 || arr[0][j]==0){
                        arr[i][j]=0;
                    }
                }
            }
        }
        if(arr[0][0]==0){
            for(int j=0;j<m;j++){
                arr[0][j]=0;
            }
        }
        if(col0==0){
            for(int i=0;i<n;i++){
                arr[i][0]=0;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        // bruteForce(arr, n, m);
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<m;j++){
        //         System.out.print(arr[i][j]+" ");;
        //     }
        //     System.out.println();
        // }
        // better(arr, n, m);
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<m;j++){
        //         System.out.print(arr[i][j]+" ");;
        //     }
        //     System.out.println();
        // }
        optimal(arr, n, m);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");;
            }
            System.out.println();
        }
        
    }
}

//coding ninjas
// import java.util.* ;
// import java.io.*; 
// public class Solution {
//     public static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> matrix, Integer n, Integer m) {
//     	// Write your code here.
//         int col0=1;
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 if(matrix.get(i).get(j)==0){
//                     matrix.get(i).set(0, 0);
//                     if (j != 0)
//                         matrix.get(0).set(j, 0);
//                     else
//                         col0 = 0;
//                 }
//             }
//         }
//         for(int i=1;i<n;i++){
//             for(int j=1;j<m;j++){
//                 if(matrix.get(i).get(j)!=0){
//                 if (matrix.get(i).get(0) == 0 || matrix.get(0).get(j) == 0) {
//                         matrix.get(i).set(j, 0);
//                     }
//                 }
//             }
//         }
//         if(matrix.get(0).get(0)==0){
//             for(int j=0;j<m;j++){
//                 matrix.get(0).set(j,0);
//             }
//         }
//         if (col0 == 0) {
//             for (int i = 0; i < n; i++) {
//                 matrix.get(i).set(0, 0);
//             }
//         }
//         return matrix;
//     }
// }