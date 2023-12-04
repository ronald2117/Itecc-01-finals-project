import java.util.*;
//width of my menu is 54 chars
public class Display {
    static Scanner scan= new Scanner(System.in);
    static Profile user = new Profile();

    public static void Welcome() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("########################################################");
        System.out.println("#                                                      #");
        System.out.println("#              Welcome to Project A.B.E.L              #");
        System.out.println("#        Personal Information Management System        #");
        System.out.println("#                  Safe and Reliable                   #");
        System.out.println("#                                                      #");
        System.out.println("#        (1) Log in                                    #");
        System.out.println("#        (2) Sign up                                   #");
        System.out.println("#        (3) Contacts                                  #");
        System.out.println("#        (4) About the Project                         #");
        System.out.println("#        (5) Privacy Policy                            #");
        System.out.println("#        (6) Terms and Agreements                      #");
        System.out.println("#        (0) Exit                                      #");
        System.out.println("#                                                      #");
        System.out.println("########################################################");
        System.out.print("\nEnter your option: ");
        int welcomeOption = scan.nextInt();
        switch(welcomeOption) {
            case 1:
                Login();
                break;
            case 2:
                Signup();
                break;
            case 3:
                Contacts();
                break;
            case 4:
                About();
                break;
            case 5:
                PrivacyPolicy(); 
                break;
            case 6:
                Agreement();
                break;
            case 0:
                break;
            default:
                System.out.println("Invalid option");;
        }
    }

    public static void Login() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("########################################################");
        System.out.println("#                                                      #");
        System.out.println("#              Welcome to Project A.B.E.L              #");
        System.out.println("#        Personal Information Management System        #");
        System.out.println("#                  Safe and Reliable                   #");
        System.out.println("#                                                      #");
        System.out.println("#                                                      #");
        System.out.println("#      Please Enter Your Username and Password  :)     #");
        System.out.println("#                                                      #");
        System.out.println("########################################################");
        scan.nextLine();
        System.out.printf("Enter your username: ");
        String loginUsername = scan.nextLine();
        System.out.printf("Enter your password: ");
        String loginPassword = scan.nextLine();

        if(loginUsername.equals(user.username) && loginPassword.equals(user.password)) {
            Menu();
        } else {
            Relogin();
        }
        
    }
    public static void Relogin() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("########################################################");
        System.out.println("#                                                      #");
        System.out.println("#              Welcome to Project A.B.E.L              #");
        System.out.println("#        Personal Information Management System        #");
        System.out.println("#                  Safe and Reliable                   #");
        System.out.println("#                                                      #");
        System.out.println("#                                                      #");
        System.out.println("#    Wrong Username or Password, Please try again  :(  #");
        System.out.println("#                                                      #");
        System.out.println("########################################################");

        System.out.printf("Enter your username: ");
        String loginUsername = scan.nextLine();
        System.out.printf("Enter your password: ");
        String loginPassword = scan.nextLine();

        if(loginUsername.equals(user.username) && loginPassword.equals(user.password)) {
            Menu();
        } else {
            Relogin();
        }
    }

    public static void Signup() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("########################################################");
        System.out.println("#                                                      #");
        System.out.println("#              Welcome to Project A.B.E.L              #");
        System.out.println("#        Personal Information Management System        #");
        System.out.println("#                  Safe and Reliable                   #");
        System.out.println("#                                                      #");
        System.out.println("#        Filling out this form means that you          #");
        System.out.println("#   Accept our Privacy Policy and Terms and Agreement  #");
        System.out.println("#                                                      #");
        System.out.println("########################################################");

        System.out.print("Username: ");
        scan.nextLine();
        user.username = scan.nextLine();
        System.out.print("Password: ");
        user.password = scan.nextLine();
        System.out.print("First Name: ");
        user.fName = scan.nextLine();
        System.out.print("Middle Name (Enter n/a if none): ");
        user.mName = scan.nextLine();
        System.out.print("Last Name: ");
        user.lName = scan.nextLine();
        System.out.print("Age: ");
        user.age = scan.nextInt();

        System.out.println("Please enter your maximum of 5 emails. \n Enter \"none\" if you don't want to add another email.");
        for(int i = 0, count = 1; i < user.emails.length; i++) {
            System.out.printf("Enter email #%d: ", count);
            user.emails[0] = scan.nextLine();
            count++;
        }

        System.out.println("Please enter your maximum of 5 contact numbers. \n Enter \"none\" if you don't want to add another contact number.");
        for(int i = 0, count = 1; i < user.contactNums.length; i++) {
            System.out.printf("Enter contact number #%d: ", count);
            user.contactNums[0] = scan.nextLine();
            count++;
        }
        
        System.out.print("Gender(m/f): ");
        user.gender = scan.next().charAt(0);
        scan.nextLine();
        System.out.print("Marital Status: ");
        user.maritalStatus = scan.nextLine();
        System.out.print("Birthday (MM/DD/YYYY): ");
        user.birthday = scan.nextLine();
        System.out.print("Birthplace: ");
        user.birthplace = scan.nextLine();
        System.out.print("Occupation: ");
        user.occupation = scan.nextLine();
        System.out.print("Permanent Address: ");
        user.permanentAddress = scan.nextLine();
        System.out.print("Current Address: ");
        user.currentAddress = scan.nextLine();
        
        Menu();
    }

    public static void Menu() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("########################################################");
        System.out.println("#                                                      #");
        System.out.printf("#        %-46s","Welcome" + " " + user.fName + " " + user.lName + "!");
        System.out.println("#");
        System.out.println("#                                                      #");
        System.out.println("#        (1) My Personal Informations                  #");
        System.out.println("#        (2) Contacts                                  #");
        System.out.println("#        (3) Events/Reminders                          #");
        System.out.println("#        (4) To-do list                                #");
        System.out.println("#        (5) Notes                                     #");
        System.out.println("#        (0) Log out                                   #");
        System.out.println("#                                                      #");
        System.out.println("########################################################");
    }

    public static void Contacts() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("########################################################");
        System.out.println("#                                                      #");
        System.out.println("#       Contact me at:                                 #");
        System.out.println("#       Email: abel.ronald2117@gmail.com               #");
        System.out.println("#       Facebook: https://www.facebook.com/ronald1617  #");
        System.out.println("#       Github: https://github.com/ronald2117          #");
        System.out.println("#                                                      #");
        System.out.println("#       (0) Exit                                       #");
        System.out.println("#                                                      #");
        System.out.println("########################################################");

        System.out.print("Enter your option: ");
        int myOption = scan.nextInt();

        if(myOption == 0) {
            Menu();
        }
        System.out.println("#                                                      #");
        System.out.println("########################################################");
    }
    public static void About() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("########################################################");
        System.out.println("#                                                      #");
        System.out.println("#        Project A.B.E.L., by Ronald Abel              #");
        System.out.println("#    is a Personal Information Management System       #");
        System.out.println("#       created as a final project for ITECC01         #");
        System.out.println("#                                                      #");
        System.out.println("#           Hope you like it! :)                       #");
        System.out.println("#                                                      #");
        System.out.println("#       (0) Exit                                       #");
        System.out.println("#                                                      #");
        System.out.println("########################################################");

        System.out.print("Enter your option: ");
        int myOption = scan.nextInt();

        if(myOption == 0) {
            Menu();
        }
    }

    public static void PrivacyPolicy() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("########################################################");
        System.out.println("#                                                      #");
        System.out.println("#        Read our Privacy Policy At:                   #");
        System.out.println("#                                                      #");
        System.out.println("#        https://bit.ly/abel-privacy-policy            #");
        System.out.println("#                                                      #");
        System.out.println("#        (0) Exit                                      #");
        System.out.println("#                                                      #");
        System.out.println("########################################################");

        System.out.print("Enter your option: ");
        int myOption = scan.nextInt();

        if(myOption == 0) {
            Menu();
        }
    }

    public static void Agreement() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("########################################################");
        System.out.println("#                                                      #");
        System.out.println("#        Read our Terms and Agreement At:              #");
        System.out.println("#                                                      #");
        System.out.println("#        https://bit.ly/terms-and-agreement            #");
        System.out.println("#                                                      #");
        System.out.println("#        (0) Exit                                      #");
        System.out.println("#                                                      #");
        System.out.println("########################################################");

        System.out.print("Enter your option: ");
        int myOption = scan.nextInt();

        if(myOption == 0) {
            Welcome();
        }
    }
}
