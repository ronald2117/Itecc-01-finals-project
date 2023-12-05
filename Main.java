import java.util.*;

public class Main {
    static Scanner scan = new Scanner(System.in);
    //Built-in profile
    public static String username = "admin";
    public static String password = "pass";
    public static String fName = "Asiong";
    public static String mName = "Cruz";
    public static String lName = "Salonga";
    public static int age = 43;
    public static String religion = "Roman Catholic";
    public static String emails[] = {"asiong.salonga@gmai.com", "hariakongtondo@yahoo.com", "n/a", "n/a", "n/a"};
    public static String contactNums[] = {"09987654321", "091231231213", "n/a", "n/a", "n/a"};
    public static char gender = 'm';
    public static String maritalStatus = "married";
    public static String birthday = "06/17/1987";
    public static String birthplace = "Tondo, Manila";
    public static String occupation = "Policeman";
    public static String permanentAddress = "143 Kathniel St., Brgy. Hiwalayan, Tondo, Manila";
    public static String currentAddress = "123 Broken St., Brgy Inuman, Tanauan, Batangas";

    public static void displayWelcome() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("#################################################################################");
        System.out.println("#                                                                               #");
        System.out.println("#                            Welcome to Project A.B.E.L                         #");
        System.out.println("#                       Personal Information Management System                  #");
        System.out.println("#                                Safe and Reliable                              #");
        System.out.println("#                                                                               #");
        System.out.println("#                (1) Log in                                                     #");
        System.out.println("#                (2) Sign up                                                    #");
        System.out.println("#                (3) Contacts                                                   #");
        System.out.println("#                (4) About the Project                                          #");
        System.out.println("#                (5) Privacy Policy                                             #");
        System.out.println("#                (6) Terms and Agreements                                       #");
        System.out.println("#                (0) Exit                                                       #");
        System.out.println("#                                                                               #");
        System.out.println("#################################################################################");
        System.out.print("\nEnter your option: ");
        int welcomeOption = scan.nextInt();
        switch(welcomeOption) {
            case 1:
                displayLogin();
                break;
            case 2:
                displaySignup();
                break;
            case 3:
                displayContacts();
                break;
            case 4:
                displayAbout();
                break;
            case 5:
                displayPrivacyPolicy(); 
                break;
            case 6:
                displayAgreement();
                break;
            case 0:
                break;
            default:
                System.out.println("Invalid option");;
        }
    }

    public static void displayMenu() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("################################################################################");
        System.out.println("#                                                                              #");
        System.out.printf("#        %-70s","Welcome" + " " + fName + " " + lName + "!");
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

    public static void displayLogin() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("#################################################################################");
        System.out.println("#                                                                               #");
        System.out.println("#                          Welcome to Project A.B.E.L                           #");
        System.out.println("#                   Personal Information Management System                      #");
        System.out.println("#                             Safe and Reliable                                 #");
        System.out.println("#                                                                               #");
        System.out.println("#                                                                               #");
        System.out.println("#                    Please Enter Your Username and Password  :)                #");
        System.out.println("#                                                                               #");
        System.out.println("#################################################################################");
        scan.nextLine();
        System.out.printf("Enter your username: ");
        String loginUsername = scan.nextLine();
        System.out.printf("Enter your password: ");
        String loginPassword = scan.nextLine();

        if(loginUsername.equals(username) && loginPassword.equals(password)) {
            displayMenu();
        } else {
            displayRelogin();
        }
        
    }
    public static void displayRelogin() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("#################################################################################");
        System.out.println("#                                                                               #");
        System.out.println("#                          Welcome to Project A.B.E.L                           #");
        System.out.println("#                   Personal Information Management System                      #");
        System.out.println("#                             Safe and Reliable                                 #");
        System.out.println("#                                                                               #");
        System.out.println("#                                                                               #");
        System.out.println("#               Wrong Username or Password, Please Try Again  :)                #");
        System.out.println("#                                                                               #");
        System.out.println("#################################################################################");

        System.out.printf("Enter your username: ");
        String loginUsername = scan.nextLine();
        System.out.printf("Enter your password: ");
        String loginPassword = scan.nextLine();

        if(loginUsername.equals(username) && loginPassword.equals(password)) {
            displayMenu();
        } else {
            displayRelogin();
        }
    }

    public static void displaySignup() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("#################################################################################");
        System.out.println("#                                                                               #");
        System.out.println("#                          Welcome to Project A.B.E.L                           #");
        System.out.println("#                   Personal Information Management System                      #");
        System.out.println("#                             Safe and Reliable                                 #");
        System.out.println("#                                                                               #");
        System.out.println("#                Filling out this form means that you                           #");
        System.out.println("#            Accept our Privacy Policy and Terms and Agreement.                 #");
        System.out.println("#                                                                               #");
        System.out.println("#################################################################################");
        System.out.print("Username: ");
        scan.nextLine();
        username = scan.nextLine();
        System.out.print("Password: ");
        password = scan.nextLine();
        System.out.print("First Name: ");
        fName = scan.nextLine();
        System.out.print("Middle Name (Enter n/a if none): ");
        mName = scan.nextLine();
        System.out.print("Last Name: ");
        lName = scan.nextLine();
        System.out.print("Age: ");
        age = scan.nextInt();
        scan.nextLine();
        System.out.print("Gender(m/f): ");
        gender = scan.next().charAt(0);
        scan.nextLine();
        System.out.print("Marital Status: ");
        maritalStatus = scan.nextLine();
        System.out.print("Religion: ");
        religion = scan.nextLine();
        System.out.print("Birthday (MM/DD/YYYY): ");
        birthday = scan.nextLine();
        System.out.print("Birthplace: ");
        birthplace = scan.nextLine();
        System.out.print("Occupation: ");0
        occupation = scan.nextLine();
        
        System.out.println("Please enter your maximum of 5 emails. \n Enter \"n/a\" if you don't want to add another email.");
        for(String email: emails) {
            email = "n/a";  //reset
        }
        for(int i = 0, count = 1; i < emails.length; i++) {
            System.out.printf("Enter email #%d: ", count);
            emails[i] = scan.nextLine();
            if(emails[i].equals("n/a")) {
                break;
            }
            count++;
        }

        System.out.println("Please enter your maximum of 5 contact numbers. \n Enter \"n/a\" if you don't want to add another contact number.");
        for(String contact: contactNums) {
            contact = "n/a";  //reset
        }
        for(int i = 0, count = 1; i < contactNums.length; i++) {
            System.out.printf("Enter contact number #%d: ", count);
            contactNums[i] = scan.nextLine();
            if(contactNums[i].equals("n/a")) {
                break;
            }
            count++;
        }
        
        
        
        System.out.print("Permanent Address: ");
        permanentAddress = scan.nextLine();
        System.out.print("Current Address: ");
        currentAddress = scan.nextLine();
        
        displayMenu();
    }


    public static void displayContacts() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("#################################################################################");
        System.out.println("#                                                                               #");
        System.out.println("#       Contact me at:                                                          #");
        System.out.println("#       Email: abel.ronald2117@gmail.com                                        #");
        System.out.println("#       Facebook: https://www.facebook.com/ronald1617                           #");
        System.out.println("#       Github: https://github.com/ronald2117                                   #");
        System.out.println("#                                                                               #");
        System.out.println("#       (0) Exit                                                                #");
        System.out.println("#                                                                               #");
        System.out.println("#################################################################################");

        System.out.print("Enter your option: ");
        int myOption = scan.nextInt();

        if(myOption == 0) {
            displayWelcome();
        }
    }
    public static void displayAbout() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("################################################################################");
        System.out.println("#                                                                              #");
        System.out.println("#                     Project A.B.E.L., by Ronald Abel                         #");
        System.out.println("#               is a Personal Information Management System                    #");
        System.out.println("#                 created as a final project for ITECC01                       #");
        System.out.println("#                                                                              #");
        System.out.println("#                         Hope you like it! :)                                 #");
        System.out.println("#                                                                              #");
        System.out.println("#       (0) Exit                                                               #");
        System.out.println("#                                                                              #");
        System.out.println("################################################################################");

        System.out.print("Enter your option: ");
        int myOption = scan.nextInt();

        if(myOption == 0) {
            displayWelcome();
        }
    }

    public static void displayPrivacyPolicy() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("################################################################################");
        System.out.println("#                                                                              #");
        System.out.println("#        Read our Privacy Policy At:                                           #");
        System.out.println("#                                                                              #");
        System.out.println("#        https://bit.ly/abel-privacy-policy                                    #");
        System.out.println("#                                                                              #");
        System.out.println("#       (0) Exit                                                               #");
        System.out.println("#                                                                              #");
        System.out.println("################################################################################");

        System.out.print("Enter your option: ");
        int myOption = scan.nextInt();

        if(myOption == 0) {
            displayWelcome();
        }
    }

    public static void displayAgreement() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("################################################################################");
        System.out.println("#                                                                              #");
        System.out.println("#        Read our Terms and Agreement At:                                      #");
        System.out.println("#                                                                              #");
        System.out.println("#        https://bit.ly/terms-and-agreement                                    #");
        System.out.println("#                                                                              #");
        System.out.println("#        (0) Exit                                                              #");
        System.out.println("#                                                                              #");
        System.out.println("################################################################################");

        System.out.print("Enter your option: ");
        int myOption = scan.nextInt();

        if(myOption == 0) {
            displayWelcome();
        }
    }
    
    static void displayInfoPage() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("################################################################################");
        System.out.println("#                                                                              #");
        System.out.println("#   My Personal Informations:                                                  #");
        System.out.println("#                                                                              #");
        System.out.printf("#   %-75s","First Name: " + fName);
        System.out.println("#");
        System.out.printf("#   %-75s","Middle Name: "+ mName);
        System.out.println("#");
        System.out.printf("#   %-75s","Last Name: " + lName);
        System.out.println("#");
        System.out.printf("#   %-75s","Age: " + age);
        System.out.println("#");
        System.out.printf("#   %-75s","Gender: " + gender);
        System.out.println("#");
        System.out.printf("#   %-75s","Marital Status: " + maritalStatus);
        System.out.println("#");
        System.out.printf("#   %-75s","Religion: " + religion);
        System.out.println("#");
        System.out.printf("#   %-75s","Birthday: " + birthday);
        System.out.println("#");
        System.out.printf("#   %-75s","Birthplace: " + birthplace);
        System.out.println("#");
        System.out.printf("#   %-75s","Occupation: " + occupation);
        System.out.println("#");
        System.out.printf("#   %-75s","Permanent Address: " + permanentAddress);
        System.out.println("#");
        System.out.printf("#   %-75s","Current Address: " + currentAddress);
        System.out.println("#");

        System.out.printf("#   %-75s","Emails: ");
        System.out.println("#");
        int emailCount = 1;
        for(int i = 0; i < emails.length; i++) {           
            if(emails[i].equals("n/a")){
                continue;
            } else {
                System.out.printf("#    #%d: %-70s", emailCount, emails[i]);
                System.out.println("#");
                emailCount += 1; 
            }
        }

        System.out.printf("#   %-75s","Contact Numbers: ");
        System.out.println("#");

        int contactCount = 1;
        for(int i = 0; i < contactNums.length; i++) {           
            if(contactNums[i].equals("n/a")){
                continue;
            } else {
                System.out.printf("#    #%d: %-70s", contactCount, contactNums[i]);
                System.out.println("#");
                contactCount += 1; 
            }
        }
        System.out.println("#                                                                              #");
        System.out.println("#                                               (1) Edit Mode   (0) Exit       #");
        System.out.println("#                                                                              #");
        System.out.println("################################################################################");

        System.out.println("Enter you option");
        int option = scan.nextInt();
        switch(option) {
            case 1:
                displayEditInfoPage();
                break;
            case 0:
                displayMenu();
                break;
            default:
                break;
        }
    }

    static void displayEditInfoPage() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("################################################################################");
        System.out.println("#                                                                              #");
        System.out.println("#   Edit Mode:                                                                 #");
        System.out.println("#                                                                              #");
        System.out.printf("#   (1) %-71s","First Name: " + fName);
        System.out.println("#");
        System.out.printf("#   (2) %-71s","Middle Name: "+ mName);
        System.out.println("#");
        System.out.printf("#   (3) %-71s","Last Name: " + lName);
        System.out.println("#");
        System.out.printf("#   (4) %-71s","Age: " + age);
        System.out.println("#");
        System.out.printf("#   (5) %-71s","Gender: " + gender);
        System.out.println("#");
        System.out.printf("#   (6) %-71s","Marital Status: " + maritalStatus);
        System.out.println("#");
        System.out.printf("#   (7) %-71s","Religion: " + religion);
        System.out.println("#");
        System.out.printf("#   (8) %-71s","Birthday: " + birthday);
        System.out.println("#");
        System.out.printf("#   (9) %-71s","Birthplace: " + birthplace);
        System.out.println("#");
        System.out.printf("#   (10) %-70s","Occupation: " + occupation);
        System.out.println("#");
        System.out.printf("#   (11) %-70s","Permanent Address: " + permanentAddress);
        System.out.println("#");
        System.out.printf("#   (12) %-70s","Current Address: " + currentAddress);
        System.out.println("#");

        System.out.printf("#   (13) %-70s","Emails: ");
        System.out.println("#");
        int emailCount = 1;
        for(int i = 0; i < emails.length; i++) {           
            if(emails[i].equals("n/a")){
                continue;
            } else {
                System.out.printf("#      #%d: %-68s", emailCount, emails[i]);
                System.out.println("#");
                emailCount += 1; 
            }
        }

        System.out.printf("#   (14) %-70s","Contact Numbers: ");
        System.out.println("#");

        int contactCount = 1;
        for(int i = 0; i < contactNums.length; i++) {           
            if(contactNums[i].equals("n/a")){
                continue;
            } else {
                System.out.printf("#      #%d: %-68s", contactCount, contactNums[i]);
                System.out.println("#");
                contactCount += 1; 
            }
        }
        System.out.println("#                                                                              #");
        System.out.println("################################################################################");

        System.out.println("Enter your option: ");
        int option = scan.nextInt();
        scan.nextLine();
        switch (option) {
            case 1:
                System.out.print("New: ");
                fName = scan.nextLine();
                displayInfoPage();
                break;
            case 2:
                System.out.print("New: ");
                mName = scan.nextLine();
                displayInfoPage();
                break;
            case 3:
                System.out.print("New: ");
                lName = scan.nextLine();
                displayInfoPage();
                break;
            case 4:
                System.out.print("New: ");
                age = scan.nextInt();
                displayInfoPage();
                break;
            case 5:
                System.out.print("New: ");
                gender = scan.next().charAt(0);
                displayInfoPage();
                break;
            case 6:
                System.out.print("New: ");
                maritalStatus = scan.nextLine();
                displayInfoPage();
                break;
            case 7:
                System.out.print("New: ");
                religion = scan.nextLine();
                displayInfoPage();
                break;
            case 8:
                System.out.print("New: ");
                birthday = scan.nextLine();
                displayInfoPage();
                break;
            case 9:
                System.out.print("New: ");
                birthplace = scan.nextLine();
                displayInfoPage();
                break;
            case 10:
                System.out.print("New: ");
                occupation = scan.nextLine();
                displayInfoPage();
                break;
            case 11:
                System.out.print("New: ");
                permanentAddress = scan.nextLine();
                displayInfoPage();
                break;
            case 12:
                System.out.print("New: ");
                currentAddress = scan.nextLine();
                displayInfoPage();
                break;
            case 13:
                System.out.print("Email #: ");
                int emailIndex = 1 - scan.nextInt();
                System.out.print("New: ");
                emails[emailIndex] = scan.nextLine();
                displayInfoPage();
                break;
            case 14:
                System.out.print("Contact #: ");
                int contIndex = 1 - scan.nextInt();
                System.out.print("New: ");
                emails[contIndex] = scan.nextLine();
                displayInfoPage();
                break;
            default:
                break;  
        }       
    }

    public static void main(String[] args) {
        displayWelcome();
    }
}
