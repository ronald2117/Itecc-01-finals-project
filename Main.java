import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static Display display = new Display();
    //Built-in profile
    
    public static void main(String[] args) {
        display.Welcome();
        System.out.print("\nEnter your option: ");
        int welcomeOption = scan.nextInt();
        if(welcomeOption == 1) {
            display.Login();
        }
    }
}
