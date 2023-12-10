import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class ProjectAbel {
    static Scanner scan = new Scanner(System.in);

    //Built-in profile
    static String username = "admin";
    static String password = "pass";
    static String fName = "Asiong";
    static String mName = "Cruz";
    static String lName = "Salonga";
    static int age = 43;
    static String religion = "Roman Catholic";
    static char gender = 'm';
    static String maritalStatus = "married";
    static String birthday = "06/17/1987";
    static String birthplace = "Tondo, Manila";
    static String occupation = "Policeman";
    static String permanentAddress = "143 Kathniel St., Brgy. Hiwalayan, Tondo, Manila";
    static String currentAddress = "123 Broken St., Brgy Inuman, Tanauan, Batangas";

    //Contacts
    static ArrayList<String[]> contacts = new ArrayList<String[]>();

    //Reminders
    static ArrayList<ArrayList<String>> reminders = new ArrayList<>();
    
    //To-do list
    static ArrayList<String[]> toDoList = new ArrayList<String[]>(); 

    public static void nextPage() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }
    public static void displayExit() {
        System.out.println("#################################################################################");
        System.out.println("#                                                                               #");
        System.out.println("#                   Thank you, Please come again! :)                            #");
        System.out.println("#                                                                               #");
        System.out.println("#################################################################################");
    }
    public static void displayWelcome() {
        System.out.println("#################################################################################");
        System.out.println("#                                                                               #");
        System.out.println("#                              Welcome to Project Abel                          #");
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
                nextPage();
                displayLogin();
                break;
            case 2:
                nextPage();
                displaySignup();
                break;
            case 3:
                nextPage();
                displayContacts();
                break;
            case 4:
                nextPage();
                displayAbout();
                break;
            case 5:
                nextPage();
                displayPrivacyPolicy(); 
                break;
            case 6:
                nextPage();
                displayAgreement();
                break;
            case 0:
                nextPage();
                displayExit();
                break;
            default:
                nextPage();
                System.out.println("Invalid option, please try again.\n");
                displayWelcome();
                break;
        }
    }

    public static void displayMenu() {
        System.out.println("################################################################################");
        System.out.println("#                                                                              #");
        System.out.printf("#                            %-50s","Good Day" + " " + fName + " " + lName + "!");
        System.out.println("#");
        System.out.println("#                                                                              #");
        System.out.println("#                             Welcome to Project Abel                          #");
        System.out.println("#                      Personal Information Management System                  #");
        System.out.println("#                               Safe and Reliable                              #");
        System.out.println("#                                                                              #");
        System.out.println("#                 (1) My Personal Informations                                 #");
        System.out.println("#                 (2) Contacts                                                 #");
        System.out.println("#                 (3) Reminders                                                #");
        System.out.println("#                 (4) To-do list                                               #");
        System.out.println("#                 (0) Log out                                                  #");
        System.out.println("#                                                                              #");
        System.out.println("################################################################################");

        System.out.print("Enter your option: ");
        int option = scan.nextInt();

        switch(option){
            case 1:
                nextPage();
                displayInfoPage();
                break;
            case 2:
                nextPage();
                displayContactList();
                break;
            case 3:
                nextPage();
                displayReminders();
                break;
            case 4:
                nextPage();
                displayTodoList();
                break;
            case 0:
                nextPage();
                displayWelcome();
                break;
            default:
                System.out.println("Invalid option, please try again. \n");
                displayMenu();
                break;
        }     
    }

    public static void displayLogin() {
        System.out.println("#################################################################################");
        System.out.println("#                                                                               #");
        System.out.println("#                         Welcome to Project Abel                               #");
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
            nextPage();
            displayMenu();
        } else {
            nextPage();
            displayRelogin();
        }
        
    }

    public static void displaySignup() {
        System.out.println("#################################################################################");
        System.out.println("#                                                                               #");
        System.out.println("#                         Welcome to Project Abel                               #");
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
        System.out.print("Gender(m/f): ");
        gender = scan.next().charAt(0);
        System.out.print("Age: ");
        age = scan.nextInt();
        religion = "n/a";
        maritalStatus = "n/a"; 
        currentAddress = "n/a";
        permanentAddress = "n/a";
        birthday = "n/a";
        birthplace = "n/a";
        occupation = "n/a";
        
        nextPage();
        displayMenu();
    }

    public static void displayRelogin() {
        System.out.println("#################################################################################");
        System.out.println("#                                                                               #");
        System.out.println("#                          Welcome to Project Abel                              #");
        System.out.println("#                   Personal Information Management System                      #");
        System.out.println("#                             Safe and Reliable                                 #");
        System.out.println("#                                                                               #");
        System.out.println("#                                                                               #");
        System.out.println("#               Wrong Username or Password, Please Try Again  :)                #");
        System.out.println("#                                                                               #");
        System.out.println("#################################################################################");

        System.out.print("Register instead?(y/n): ");
        char choice = scan.next().charAt(0);
        if(choice == 'y') {
            nextPage();
            displaySignup();
        }
        scan.nextLine();
        System.out.print("Enter your username: ");
        String loginUsername = scan.nextLine();
        System.out.print("Enter your password: ");
        String loginPassword = scan.nextLine();

        if(loginUsername.equals(username) && loginPassword.equals(password)) {
            nextPage();
            displayMenu();
        } else {
            nextPage();
            displayRelogin();
        }
    }


    public static void displayContacts() {
        System.out.println("#################################################################################");
        System.out.println("#                                                                               #");
        System.out.println("#       Contact me at:                                                          #");
        System.out.println("#       Email: abel.ronald2117@gmail.com                                        #");
        System.out.println("#       Facebook: https://www.facebook.com/ronald1617                           #");
        System.out.println("#       Github: https://github.com/ronald2117                                   #");
        System.out.println("#                                                                               #");
        System.out.println("#                                                                   (0) Exit    #");
        System.out.println("#                                                                               #");
        System.out.println("#################################################################################");

        System.out.print("Enter your option: ");
        int myOption = scan.nextInt();

        if(myOption == 0) {
            nextPage();
            displayWelcome();
        } else {
            System.out.println("Invalid option, please try again.\n");
            displayContacts();
        }
    }
    public static void displayAbout() {
        System.out.println("################################################################################");
        System.out.println("#                                                                              #");
        System.out.println("#                      Project Abel, by Ronald Abel                            #");
        System.out.println("#               is a Personal Information Management System                    #");
        System.out.println("#                 created as a final project for ITECC02                       #");
        System.out.println("#                                                                              #");
        System.out.println("#                         Hope you like it! :)                                 #");
        System.out.println("#                                                                              #");
        System.out.println("#                                                                  (0) Exit    #");
        System.out.println("#                                                                              #");
        System.out.println("################################################################################");

        System.out.print("Enter your option: ");
        int myOption = scan.nextInt();

        if(myOption == 0){
            nextPage();
            displayWelcome();
        } else {
            System.out.println("Invalid option, please try again.\n");
            displayAbout();
        }
    }

    public static void displayPrivacyPolicy() {
        System.out.println("################################################################################");
        System.out.println("#                                                                              #");
        System.out.println("#        Read our Privacy Policy At:                                           #");
        System.out.println("#                                                                              #");
        System.out.println("#        https://bit.ly/abel-privacy-policy                                    #");
        System.out.println("#                                                                              #");
        System.out.println("#                                                                  (0) Exit    #");
        System.out.println("#                                                                              #");
        System.out.println("################################################################################");

        System.out.print("Enter your option: ");
        int myOption = scan.nextInt();

        if(myOption == 0) {
            nextPage();
            displayWelcome();
        } else {
            System.out.println("Invalid option, please try again.\n");
            displayPrivacyPolicy();
        }
    }

    public static void displayAgreement() {
        System.out.println("################################################################################");
        System.out.println("#                                                                              #");
        System.out.println("#        Read our Terms and Agreement At:                                      #");
        System.out.println("#                                                                              #");
        System.out.println("#        https://bit.ly/terms-and-agreement                                    #");
        System.out.println("#                                                                              #");
        System.out.println("#                                                                 (0) Exit     #");
        System.out.println("#                                                                              #");
        System.out.println("################################################################################");

        System.out.print("Enter your option: ");
        int myOption = scan.nextInt();

        if(myOption == 0) {
            nextPage();
            displayWelcome();
        } else {
            System.out.println("Invalid option, please try again.\n");
            displayAgreement();
        }
    }
    
    static void displayInfoPage() {
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
        System.out.println("#                                                                              #");
        System.out.println("#                                                       (1) Edit   (0) Exit    #");
        System.out.println("#                                                                              #");
        System.out.println("################################################################################");

        System.out.print("Enter you option: ");
        int option = scan.nextInt();
        switch(option) {
            case 1:
                nextPage();
                displayEditInfoPage();
                break;
            case 0:
                nextPage();
                displayMenu();
                break;
            default:
                nextPage();
                System.out.println("Invalid option, please try again.\n");
                displayInfoPage();
                break;
        }
    }

    static void displayEditInfoPage() {
        System.out.println("################################################################################");
        System.out.println("#                                                                              #");
        System.out.println("#    What do you want to edit?:                                                #");
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
        System.out.println("#                                                                              #");
        System.out.println("#                                                                  (0) Exit    #");
        System.out.println("#                                                                              #");
        System.out.println("################################################################################");

        System.out.print("Enter your option: ");
        int option = scan.nextInt();
        scan.nextLine();
        switch (option) {
            case 1:
                System.out.print("New: ");
                fName = scan.nextLine();
                nextPage();
                displayInfoPage();
                break;
            case 2:
                System.out.print("New: ");
                mName = scan.nextLine();
                nextPage();
                displayInfoPage();
                break;
            case 3:
                System.out.print("New: ");
                lName = scan.nextLine();
                nextPage();
                displayInfoPage();
                break;
            case 4:
                System.out.print("New: ");
                age = scan.nextInt();
                nextPage();
                displayInfoPage();
                break;
            case 5:
                System.out.print("New: ");
                gender = scan.next().charAt(0);
                nextPage();
                displayInfoPage();
                break;
            case 6:
                System.out.print("New: ");
                maritalStatus = scan.nextLine();
                nextPage();
                displayInfoPage();
                break;
            case 7:
                System.out.print("New: ");
                religion = scan.nextLine();
                nextPage();
                displayInfoPage();
                break;
            case 8:
                System.out.print("New: ");
                birthday = scan.nextLine();
                nextPage();
                displayInfoPage();
                break;
            case 9:
                System.out.print("New: ");
                birthplace = scan.nextLine();
                nextPage();
                displayInfoPage();
                break;
            case 10:
                System.out.print("New: ");
                occupation = scan.nextLine();
                nextPage();
                displayInfoPage();
                break;
            case 11:
                System.out.print("New: ");
                permanentAddress = scan.nextLine();
                nextPage();
                displayInfoPage();
                break;
            case 12:
                System.out.print("New: ");
                currentAddress = scan.nextLine();
                nextPage();
                displayInfoPage();
                break;
            case 0:
                nextPage();
                displayInfoPage();
            default:
                nextPage();
                System.out.println("Invalid option, please try again.\n");
                displayEditInfoPage(); 
                break;  
        }       
    }

    public static void displaySearchContacts(String searched){
        System.out.println("################################################################################");
        System.out.println("#                                                                              #");
        System.out.println("#    Searched Contact List:                                                    #");
        System.out.println("#                                                                              #");
        System.out.println("#     Name:                         Contact Detail:                            #");

        for(String row[]: contacts) {
            if(!row[0].contains(searched)) continue;
            int index = contacts.indexOf(row) + 1;
            System.out.printf("#  (%d) %-29s %-42s", index, row[0], row[1]);
            System.out.println("#");
        }

        System.out.println("#                                                                              #");
        System.out.println("#                               (1) Add   (2) Remove   (3) Search   (0) Back   #");
        System.out.println("#                                                                              #");                
        System.out.println("################################################################################");

        System.out.print("Enter your option: ");
        int option = scan.nextInt();                                                                                           
        scan.nextLine();

        int lastIndex = contacts.size();
        switch(option) {
            case 1:
                System.out.print("Contact name: ");
                String name = scan.nextLine();
                System.out.print("Contact detail: ");
                String cont = scan.nextLine();
                contacts.add(new String[2]);
                contacts.get(lastIndex)[0] = name;
                contacts.get(lastIndex)[1] = cont;
                nextPage();
                displayContactList();
                break;
            case 2:
                if (contacts.size() == 0) {
                    nextPage();
                    System.out.println("Nothing to delete.\n");
                    displayContactList();
                }
                System.out.print("Index of contact to remove: ");
                int toRemove = scan.nextInt();
                contacts.remove(toRemove - 1);
                nextPage();
                displayContactList();
                break;
            case 3:
                System.out.print("Contact name to search: ");
                String search = scan.nextLine();
                nextPage();
                displaySearchContacts(search);
                break;
            case 0:
                nextPage();
                displayContactList();
                break;
            default:
                nextPage();
                System.out.println("Invalid option, please try again.\n");
                displayContactList();
                break;
        }

    }

    public static void displayContactList(){
        
        System.out.println("################################################################################");
        System.out.println("#                                                                              #");
        System.out.println("#    My Contact List:                                                          #");
        System.out.println("#                                                                              #");
        System.out.println("#     Name:                         Contact Detail:                            #");
        
        int count = 1;
        for(String row[]: contacts) {
            System.out.printf("#  (%d) %-29s %-42s", count, row[0], row[1]);
            System.out.println("#");
            count++;
        }

        System.out.println("#                                                                              #");
        System.out.println("#                               (1) Add   (2) Remove   (3) Search   (0) Exit   #");
        System.out.println("#                                                                              #");
        System.out.println("################################################################################");

        System.out.print("Enter your option: ");
        int option = scan.nextInt();
        scan.nextLine();

        int lastIndex = contacts.size();
        switch(option) {
            case 1:
                System.out.print("Contact name: ");
                String name = scan.nextLine();
                System.out.print("Contact detail: ");
                String cont = scan.nextLine();
                contacts.add(new String[2]);
                contacts.get(lastIndex)[0] = name;
                contacts.get(lastIndex)[1] = cont;
                nextPage();
                displayContactList();
                break;
            case 2:
                if (contacts.size() == 0) {
                    nextPage();
                    System.out.println("Nothing to delete.\n");
                    displayContactList();
                }
                System.out.print("Index of contact to remove: ");
                int toRemove = scan.nextInt();
                contacts.remove(toRemove - 1);
                nextPage();
                displayContactList();
                break;
            case 3:
                System.out.print("Contact name to search: ");
                String search = scan.nextLine();
                nextPage();
                displaySearchContacts(search);
                break;
            case 0:
                nextPage();
                displayMenu();
                break;
            default:
                nextPage();
                System.out.println("Invalid option, please try again.\n");
                displayContactList();
                break;
        }
    }

    public static void displayReminders(){
        reminders.add(new ArrayList<>());
        reminders.get(0).add("Itecc01 Proj Submission");
        reminders.get(0).add("12/11/2023");
        reminders.get(0).add("10:30 AM");
        System.out.println("################################################################################");
        System.out.println("#                                                                              #");
        System.out.println("#      My Reminders:                                                           #");
        System.out.println("#                                                                              #");
        System.out.println("#         Name:                  Date:                  Time:                  #");

        int count = 1;
        for(ArrayList<String> row: reminders) {
            if(!row.isEmpty()){
                String name = row.get(0);
                if(name.length() > 19) {
                    name = name.substring(0, 19) + "...";
                }

            System.out.printf("#      (%d) %-22s %-22s %-22s",count, name, row.get(1), row.get(2));
            System.out.println("#");
            count++;
            }
        }
        
        System.out.println("#                                                                              #");
        System.out.println("#                                           (1) Add   (2) Remove   (0) Exit    #");
        System.out.println("#                                                                              #");
        System.out.println("################################################################################");

        //get last index of the ArrayList
        int lastIndex = reminders.size();

        System.out.print("Enter your option: ");
        int option = scan.nextInt();
        scan.nextLine();
        switch(option) {
            case 1:
                System.out.print("Reminder name: ");
                String name = scan.nextLine();
                System.out.print("Date(MM/DD/YYYY): ");
                String date = scan.nextLine();
                System.out.print("Time: ");
                String time = scan.nextLine();
                reminders.add(new ArrayList<>());
                reminders.get(lastIndex).add(name);
                reminders.get(lastIndex).add(date);
                reminders.get(lastIndex).add(time);
                nextPage();
                displayReminders();
                break;
            case 2:
                System.out.print("Index of reminder to remove: ");
                int toRemove = scan.nextInt();
                reminders.remove(toRemove - 1);
                nextPage();
                displayReminders();
                break;
            case 0:
                nextPage();
                displayMenu();
                break;
            default:
                nextPage();
                System.out.println("Invalid option, please try again.\n");
                displayReminders();
                break;
        }
    }

    public static void displayTodoList(){
        System.out.println("################################################################################");
        System.out.println("#                                                                              #");
        System.out.println("#      To-do List:                                                             #");
        System.out.println("#                                                                              #");
        
        int count = 1; //index count for every todo item
        for(String row[]: toDoList) {
            //if the name exceeds 63 chars (...) will be added
            String name = row[1];
                if(name.length() > 19) {
                    name = name.substring(0, 62) + "...";
                }
            System.out.printf("#     (%d) [%s] %-65s", count, row[0], name);
            System.out.println("#");
            count++;
        }
        
        System.out.println("#                                                                              #");
        System.out.println("#                       (1) Add   (2) Remove  (3) Check/Uncheck    (0) Exit    #");
        System.out.println("#                                                                              #");
        System.out.println("################################################################################");

        //get last index of the ArrayList for adding new list
        int lastIndex = toDoList.size();

        System.out.print("Enter your option: ");
        int option = scan.nextInt();
        scan.nextLine();
        switch(option) {
            case 1:
                System.out.print("To-do name: ");
                String name = scan.nextLine();
                toDoList.add(new String[2]);
                toDoList.get(lastIndex)[0] = " ";
                toDoList.get(lastIndex)[1] = name;
                nextPage();
                displayTodoList();
                break;
            case 2:
                System.out.print("Index of To-do to remove: ");
                int toRemove = scan.nextInt();
                toDoList.remove(toRemove - 1);
                nextPage();
                displayTodoList();
                break;
            case 3:
                System.out.print("Index of To-do to check/uncheck: ");
                int toCheck = scan.nextInt();
                String checkBox = toDoList.get(toCheck - 1)[0];
                System.out.println(checkBox.equals(" "));
                if(checkBox.equals("✓"))
                    toDoList.get(toCheck - 1)[0] = " ";
                else
                    toDoList.get(toCheck - 1)[0] = "✓";
                nextPage();
                displayTodoList();
                break;
            case 0:
                nextPage();
                displayMenu();
                break;
            default:
                nextPage();
                displayReminders();
                break;
        }
    }

    public static void main(String[] args) {
        nextPage();
        displayWelcome();
    }
}
