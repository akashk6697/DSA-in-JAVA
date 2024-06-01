import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        int rem,sum=0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n!=0){
            rem = n % 10;
           sum += rem;
           n = n/10;
        }
        sc.close();
        System.out.print("Digit Sum is " +sum);
    }
}
