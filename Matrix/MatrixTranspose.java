import java.util.Scanner;

public class MatrixTranspose {
     public static void main(String args[]) {
      try (Scanner sc = new Scanner(System.in)) {
        int n = sc.nextInt();
          int m = sc.nextInt();

  // 1st approach 
          int matrix[][] = new int[n][m];
          for(int i=0; i<n; i++) {
               for(int j=0; j<m; j++) {
                   matrix[i][j] = sc.nextInt();
               }
          }


          System.out.println("The transpose is : ");
          //To print transpose
          for(int j=0; j<m ;j++) {
              for(int i=0; i<n; i++) {
                  System.out.print(matrix[i][j]+" ");
              }
              System.out.println();
          }


          // 2nd approach 


        //   int matrix1[][] = new int[n][m];
        //   for(int i=0; i<n; i++) {
        //        for(int j=0; j<m; j++) {
        //            matrix[i][j] = sc.nextInt();
        //        }
        //   }


        //   System.out.println("The transpose is : ");
          
        //   for(int i=0;i<n;i++)
        // {
        //     for(int j=i+1;j<n;j++)
        //     {
        //        int temp = matrix[i][j];
        //         matrix[i][j] = matrix[j][i];
        //         matrix[j][i] = temp;
        //     }
        //}
        //To print transpose
      
    }
   }
}

