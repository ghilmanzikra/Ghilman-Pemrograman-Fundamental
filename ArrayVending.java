import java.util.Scanner;

public class ArrayVending{
	public static void main(String[] args){
	
		String[] menu = {"Tea", "Expresso", "Americano", "Water", "Hot Chocolate"};
		Scanner sc = new Scanner(System.in);
		
		int choice;
		
		if(sc.hasNextInt()){
			choice = sc.nextInt();
			
			if(choice >=0 && choice < menu.length){
				String selectedDrink = menu[choice];
				System.out.println(selectedDrink);
				}else{
				System.out.println("Invalid");
				}
			}else{
				System.out.println("Invalid input. Please enter a valid integer");
			}
			sc.close();
	}
}