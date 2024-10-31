
public class Food3		//public header 
{
	protected String str;		//Field variable for the finla string that is printed 
	
	public Food3 ()		//empty constructor to initialize str 
	{
		str = new String("");		//initializes str 
	}
	
	public Food3 (String prepMethod, String ingredient, String name, int cost, int piece )		//constructor with variables used to print final string 
	{	
		final int CENTS_TO_DOLLARS = 100;		//D&I variable used to format the ammount of money 
		double total = 0.0;						//D&I total 
		total = (cost*piece)/CENTS_TO_DOLLARS;	//Calculates total 
		str = String.format("At the sale: %s %s with %s will be sold for %d cents each. With %d %s(s),$%.2f can be made.", name, prepMethod, ingredient, cost, piece, ingredient, total);
		//Creates the result of the text using String.format 
	}

	public void printForSale()					//Method to print str 
	{
		System.out.println(str);				//Prints str 
	}
}


