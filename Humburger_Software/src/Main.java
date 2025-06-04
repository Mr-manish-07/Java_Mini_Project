import java.util.Scanner;

public  class Main {
	public static void main (String[] args) {

		System.out.println("-----------------BURGER TYPE--------------");
		Hamburger.burgerMenu ();
		System.out.println("-----------------DRINK TYPE---------------");
		Drink.drinkMenu ();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the type of burger : ");
		String sc = scanner.next();
		char type1=sc.toUpperCase().charAt(0);
		System.out.println("Enter Extra Topping : ");
		int extraTopping = scanner.nextInt();


		System.out.println("Enter the type of Drink :");
		String sc1 = scanner.next();
		char type2=sc1.toUpperCase().charAt(0);
		System.out.println("Enter Extra Size : ");
		int extraSize = scanner.nextInt();
		Hamburger hamburger = new Hamburger(type1,extraTopping);
		Drink drink = new Drink(type2,extraSize);

		hamburger.printBill ();
		drink.printBill ();
		int total = hamburger.getBill ()+ drink.getBill ();
		System.out.println ("Total bill for your order is "+total);
		
	}
}