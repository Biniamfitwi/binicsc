import java.util.Scanner;
public class Prime3 { 

    public static void main(String[] args ){ 
    	System.out.println( " please  enter your number");
    	Scanner bin = new Scanner (System.in);
    	 int x = bin.nextInt();
    	 Prime3 z= new Prime3();
    	 boolean y= z.isPrime(x);
    	 if (y == true  )
    	 System.out.println("the number is prime" );
    	 else
    		 System.out.println("the number is  not prime" );
    	 
    }
	

	public boolean isPrime( int num) { 
		
		if (num<2 ) 
			return false;
		
		int count = 0;
		for (int x =2; x*x <num ; x++) { 
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





