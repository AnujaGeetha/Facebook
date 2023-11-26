package loop;

public class Cricket2 
{
	

	   public void bowling()
	   {
		   System.out.println("Bowling") ;
		   }
	   
	   public void batting()
	   {
		   System.out.println("Batting") ;
		   }
	   
	   public void fielding()
	   {
		   System.out.println("Fielding") ;
		   }
	   public void call()
	   {
		   bowling();//we can call the non static method inside another method with this keyword and without this keyword 
		   this.batting();
		   fielding();
	   }
	  
	   public static void main(String[] args)
	   {
		   Cricket2 c = new Cricket2();
		   c. call();
	   }

}
