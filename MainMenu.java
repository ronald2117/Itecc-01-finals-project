import java.util.*;

public class MainMenu {
    static Scanner scan = new Scanner(System.in);
    static Profile user = new Profile();

    public void displayMenu() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("################################################################################");
        System.out.println("#                                                                              #");
        System.out.printf("#        %-70s","Welcome" + " " + user.fName + " " + user.lName + "!");
        System.out.println("#");
        System.out.println("#                                                                              #");
        System.out.println("#        (1) My Personal Informations                                          #");
        System.out.println("#        (2) Contacts                                                          #");
        System.out.println("#        (3) Events/Reminders                                                  #");
        System.out.println("#        (4) To-do list                                                        #");
        System.out.println("#        (5) Notes                                                             #");
        System.out.println("#        (0) Log out                                                           #");
        System.out.println("#                                                                              #");
        System.out.println("################################################################################");

        System.out.print("Enter your option: ");
        int option = scan.nextInt();

        switch(option){
            case 1:
                displayInfoPage();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 0:
                break;
            default:
                System.out.println("Invalid option");
                break;
        }     
    }
    static void displayInfoPage() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("################################################################################");
        System.out.println("#                                                                              #");
        System.out.println("#   My Personal Informations:                                                  #");
        System.out.println("#                                                                              #");
        System.out.printf("#   %-75s","First Name: " + user.fName);
        System.out.println("#");
        System.out.printf("#   %-75s","Middle Name: "+ user.mName);
        System.out.println("#");
        System.out.printf("#   %-75s","Last Name: " + user.lName);
        System.out.println("#");
        System.out.printf("#   %-75s","Age: " + user.age);
        System.out.println("#");
        
        for(int i = 0; i < user.emails.length; i++) {
            if(user.emails[i].equals("n/a")){
                continue;
            } else {
                System.out.printf("#   %-75s","Email: " + user.age);
                System.out.println("#");
            }
        }

        System.out.println("#                                                                                               #");
        System.out.println("#################################################################################################");
    }
}
