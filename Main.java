import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Display display = new Display();

        //Built-in profile
        Profile ronald = new Profile(
             "haringtondo",
             "bestbytest",
             "Asiong",
             "Rotonda",
             "Salonga",
             32,
             09876543212,
             123-567-656,
             "hari_ng_tondo@gmail.com",
             'M',
             "Married",
             "06/17/81",
             "Tondo, Manila",
             "Police",
             "565 Zone 7, Brgy. Patayan, Tondo, Manila",
             "123 Zone 8, Brgy. Walasamapa, Tondo, Manila, "
        );
        
        display.Welcome();
        System.out.print("\nEnter your option: ");
        int wOption = scan.nextInt();
        if(wOption == 1) {
            ;
        }
    }
}
