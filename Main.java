import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Display display = new Display();

        //Built-in profile
        Profile ronald = new Profile(
             "ronald2117",
             "ronaldthebest",
             "Ronald",
             "N/A",
             "Abel",
             22,
             234033,
             2489999,
             "ahdjddjdj@jfjrjr.com",
             'M',
             "Single",
             "06/17/01",
             "Tondo, Manila",
             "student",
             "565 Zone 7, Brgy. Patayan, Tanauan City, Batangas",
             "Same as permanent Address"
        );
        
        display.Welcome();
        System.out.print("\nEnter your option: ");
        int wOption = scan.nextInt();
        if(wOption == 1) {
            ;
        }
    }
}
