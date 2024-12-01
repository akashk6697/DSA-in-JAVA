import java.util.Scanner;

public class PrimeNumber {
    public static boolean isPrime(int n) {
        //Your code goes here
        if (n <= 1) return false; // Numbers <= 1 are not prime
        
        // Check divisors from 2 to n-1
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false; 
            }
        }

        return true; 
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         if (isPrime(n)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}