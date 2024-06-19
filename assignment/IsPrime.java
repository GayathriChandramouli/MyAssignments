package week1.day2;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int num=7;
           boolean flag=true;
           
           for(int i=2; i<num; i++)
           {
        	   if( num %i== 0)
        	   {
        		   flag=false;
        		   break;
        	   }
           }
           if (flag==true)
           {
        	   System.out.println("the given number "+num+" is a prime number");
           }else
        	   System.out.println("the given number "+num+" is not a prime number");        	   
	}
}
