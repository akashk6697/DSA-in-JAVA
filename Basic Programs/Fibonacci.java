import java.util.Scanner;

public class Fibonacci {
    	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	        Fibnacci(n);
	        for(int i =0;i<n;i++){
	            System.out.println(Fibnacci(i));
	        }
            sc.close();
		}
	   	public static int Fibnacci(int n){
	   	  if(n<=1){
	   	  return n;
	   	}
	   	 else{ 
	   	  return Fibnacci(n-1) + Fibnacci(n-2);
	   	 }
        }
}
