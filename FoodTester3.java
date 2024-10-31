
//Food Tester3
//William Tang
//Period 5
//10/25/24
public class FoodTester3		//Header called FoodTester 
{
	public static void main(String[] args)		//the main method of the program 
	{
		int cost1 = 50;		//D&I cost 1
		int cost2 = 100;	//D&I cost 2
		int cost3 = 250;	//D&I cost 3

		int piece1 = 12;	//D&I piece1
		int piece2 = 3;		//D&I piece2
		int piece3 = 8;		//D&I piece3
		FoodTester3 ft3 = new FoodTester3();	//Creates an instance of Itself to call the printLns method 
		ft3.printLns();		//calls printLns method to print the empty lines 
			Food3 food1 = new Food3 ("baked", "banana", "muffins", cost1, piece1);		//Creates an instance of Food3 and sends in parameters 
		food1.printForSale();		//Calls the printForSale method 
		Food3 food2 = new Food3 ("fried", "yam", "fritters", cost2, piece2);	//Instance for Food3, inputs variables for fritters
		food2.printForSale();	//Prints info for fritters 
		Pizza3 pizza = new Pizza3 ("pepperoni", cost3, piece3);		//Instance, puts info for a pizza
		pizza.printForSale();	//Prints new info 
		DeepDishPizza deepDish = new DeepDishPizza ("pepperoni", cost3, piece3);	//Instance, puts info for DeepDishPizza
		deepDish.printForSale();	//prints new info 
		ft3.printLns(); 	//Prints empty lines the end of code 
	}
	public void printLns()	//Method to print begining and end lines 
	{
		System.out.println("\n\n\n");		//Prints 3 empty lines 
	}
}
