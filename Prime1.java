package javabasic;
import java.util.Scanner;
public class Prime1 { 

    public static void main(String[] args ){ 
    	System.out.println( " please  enter your number");
    	Scanner bin = new Scanner (System.in);
    	 int r =bin.nextInt();
    	 Prime1 z= new Prime1();
    	 boolean y= z.isPrime(r);
    	 if (y == true  )
    	 System.out.println("the number is prime" );
    	 else
    		 System.out.println("the number is  not prime" );
    	 
    }
	

	public boolean isPrime( int num) { 
		
		if (num<2 ) 
			return false;
		int count = 0;
		for (int x =2; x<num/2; x++) { 
			count++; 
			if( num%x ==0 ) {
				System.out.println( "the programm is looping " +  count  + " times "  ) ;
				return false;	
			}
		}
		System.out.println( "the programm is looping " +  count  +  " times "  ) ; 
		return true;
	} 
}

