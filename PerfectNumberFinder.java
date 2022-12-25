package patika;
import java.util.Scanner; 
public class PerfectNumberFinder {

	public static void main (String[]args) {
		
	int number ;
	int divider = 0;
		 Scanner input = new Scanner(System.in);
	     System.out.print("Enter the number you want to check : " );
	     number = input.nextInt();
	     
	   for ( int i = 1 ; i < number ; i++ ) {
		   if ( number % i == 0 ) {
			  
			   divider+= i ;
			   
		   }
		   
		   }
	   if (divider == number ) {
		   System.out.print(divider + " is a perfect number.");   
		   
	}else {
		System.out.print("It is not a perfect number ");
	}
	    
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
