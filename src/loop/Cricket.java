package loop;

public class Cricket 
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
   Cricket()
   {
	   bowling();
	   batting();
	   fielding();
	   }
   
   public static void main(String[] args)
   {
	   Cricket c = new Cricket();
   }
}
