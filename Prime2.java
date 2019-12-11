import java.util.Scanner;
public class Prime2 { 

    public static void main(String[] args ){ 
    	System.out.println( " please  enter your number");
    	Scanner bin = new Scanner (System.in);
    	 int x =bin.nextInt();
    	 Prime2 z= new Prime2();
    	 boolean y= z.isPrime(x);
    	 if (y == true  )
    	 System.out.println("the number is prime" );
    	 else
    		 System.out.println("the number is  not prime" );
    	 
    }
	

	public boolean isPrime( int num) { 
		
		if (num<2 ) 
			return false;
		if (num==2) return true;
		int count = 0;
		for (int x =3; x<= num/2; x=x+2) { 
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



