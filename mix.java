mport java.lang.Math;
import java.util.Scanner;
public class max {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please input 3 integers: ");
        String x = keyboard.nextLine();
        String y = keyboard.nextLine();
        String z = keyboard.nextLine();
        int max = Math.max(x,y,z);
        System.out.println(x + " " + y + " "+z);
        System.out.println("The max of three is: " + max);
    }
}   