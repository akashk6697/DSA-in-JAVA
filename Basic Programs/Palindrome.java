import java.util.Scanner;

public class Palindrome {
    public static void main(String args[]) {
        int rem, rev = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int originalNumber = n; 
        sc.close();

        while (n > 0) {
            rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }

        if (originalNumber == rev) {
            System.out.println("Palindrome number");
        } else {
            System.out.println("Not a palindrome number");
        }
    }
}
