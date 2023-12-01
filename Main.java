import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Display display = new Display();

        display.Welcome();
        int welcomeOpt = scan.nextInt();
    }
}
