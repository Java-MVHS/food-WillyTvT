//Pizza3.java
//William Tang
//Period 5 
//10/25/24
public class Pizza3 extends Food3		//public header, extends Food3 
{
	public Pizza3(String ingredientIn,int cost3, int piece3)		//Constructor, recieves info from FoodTester to send pizzas variables to the super 
	{
		super("baked", ingredientIn, "Pizza", cost3, piece3);	//Sends the inputs to Food3 to print 
	}
	public Pizza3(String ingredientIn, String nameIn, int cost3,int piece3)		//New Constructor to fit with Food  
	{
		super("baked", ingredientIn, nameIn, cost3, piece3);	//sends inputs to Food3 
	}
}

