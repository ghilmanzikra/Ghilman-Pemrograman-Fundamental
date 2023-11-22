import java.util.Scanner;

public class Fahrenheit {
    //your code goes here
    
    static double fahr(double celsius) {
        double fahr = 1.8 * celsius + 32;
        return fahr;
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        double c = sc.nextDouble(); 

        System.out.println(fahr(c));
    }
}