// Java Program for Square Star Pattern

package PatternPrintring;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        int i,j;
    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }
    }

