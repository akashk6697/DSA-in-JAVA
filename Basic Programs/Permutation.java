import java.util.Scanner;

public class Permutation {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact = fact * i;

        }
        int number = n - r;
        int fact2 = 1;
        for (int i = number; i > 1; i=i-1)  
            {  
                fact2 = fact2 * i; 
            }  
            int per = fact / fact2;
        System.out.println("Permutation of n :" +per);
        
           sc.close();
    }
}
