package week1.assignment;

public class PalindromeCheck {

	public static void main(String[] args) {
		int input=12345;
		int output= 0;
		int temp= input;
		
		for( int i=input; i>0 ; i=i/10 )
		{
			 int rem= input%10;
			 output=(output*10)+rem;  
		     input=input/10;				
			}    
	 			
			if(temp==output)    
				System.out.println(temp+" is palindrome ");    
			else    
				System.out.println(temp+" is not a palindrome");
		}
		

	}
