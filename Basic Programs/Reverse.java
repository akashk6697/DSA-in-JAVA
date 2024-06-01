/// reverse a given number 
// input - 123 
// output - 321

import java.util.*;
 class Main{
    public static void main(String args[]){
        int rem, rev =0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n>0){
            rem = n% 10;
            rev = rev * 10 + rem;
            n = n/10;

        }
        sc.close();
        System.out.println("Reverse number is " + rev );
    }
}
