import java.util.Scanner;

public class Factorial {
    	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	      int res =  Factorial(n);
	       
	     System.out.println(res);
	     sc.close();
        }
	   	  public static int Factorial (int n){
	   	  if(n==1 || n== 0){
	   	  return 1;
	   	 }
	   	 else{ 
	   	  return n * Factorial(n-1);
	   	 }
	
          }
}
