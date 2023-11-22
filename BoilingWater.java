import java.util.Scanner;

public class BoilingWater{
	public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	int tempt = sc.nextInt();
	
	if(tempt >= 100){
		System.out.println("Boiling");
	}else if(tempt < 100){
		System.out.println("Not Boiling");
	}else{
		System.out.println("Not Boiling");
	}
}
}