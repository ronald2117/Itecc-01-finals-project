import java.util.*;

public class Display {
    static Scanner scan= new Scanner(System.in);
    static Profile user = new Profile(
             "haringtondo",
             "bestbytest",
             "Asiong",
             "Rotonda",
             "Salonga",
             32,
             "639876543212",
             "123-567-656",
             "hari_ng_tondo@gmail.com",
             'M',
             "Married",
             "06/17/81",
             "Tondo, Manila",
             "Policeman",
             "565 Zone 7, Brgy. Patayan, Tondo, Manila",
             "123 Zone 8, Brgy. Walasamapa, Tondo, Manila"
        );

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
        System.out.println("#        (3) About us                                  #");
        System.out.println("#        (4) Report a problem                          #");
        System.out.println("#        (0) Exit                                      #");
        System.out.println("#                                                      #");
        System.out.println("########################################################");
    }

    public static void Menu() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("########################################################");
        System.out.println("#                                                      #");
        System.out.println("#              Welcome to Project A.B.E.L              #");
        System.out.println("#        Personal Information Management System        #");
        System.out.println("#                  Safe and Reliable                   #");
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


    public static void Login() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("########################################################");
        System.out.println("#                                                      #");
        System.out.println("#              Welcome to Project A.B.E.L              #");
        System.out.println("#        Personal Information Management System        #");
        System.out.println("#                  Safe and Reliable                   #");
        System.out.println("#                                                      #");
        System.out.println("#      Please Enter Your Username and Password  :)     #");
        System.out.println("#                                                      #");
        System.out.println("########################################################");
        System.out.printf("Enter your username: ");
        String loginUsername = scan.nextLine();
        System.out.printf("Enter your password: ");
        String loginPassword = scan.nextLine();

        if(loginUsername == user.username && loginPassword == user.password) {
            Menu();
        }
        
    }
}
