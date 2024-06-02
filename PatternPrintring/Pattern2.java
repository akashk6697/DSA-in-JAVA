package PatternPrintring;

import java.util.Scanner;

public class Pattern2 {
      public static void main(String[] args) {
        int i,j;
    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(i=0;i<n;i++){
            for(j=i;j<n;j++){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }
}
