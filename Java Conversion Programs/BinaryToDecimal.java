import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        int decimal = 0;
        int n = 0;

        Scanner sc = new Scanner(System.in);
        int binary = sc.nextInt();
        while (binary > 0) {
            int temp = binary % 10;
            decimal += temp * Math.pow(2, n);
            binary = binary / 10;
            n++;
        }
        sc.close();
        System.out.println("Decimal number is " + decimal);
    }
}
