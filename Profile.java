public class Profile {
    String username;
    String password;                              
    String fName;                               
    String mName;                                         
    String lName;
    int age;
    int phoneNum;
    int teleNum;
    String email;
    char gender;
    String maritalStatus;                                 
    String birthday;                                 
    String birthplace;
    String occupation;
    String permanentAddress;
    String currentAddress;

    public Profile (
                String username,
                String password,
                String fName,
                String mName,
                String lName,
                int age,
                int phoneNum,
                int teleNum,
                String email,
                char gender,
                String maritalStatus,
                String birthday,
                String birthplace,
                String occupation,
                String permanentAddress,
                String currentAddress
            ) {
        this.username = username;
        this.password = password;
        this.fName = fName;
        this.mName = mName;
        this.lName = lName;
        this.age = age;
        this.phoneNum = phoneNum;
        this.teleNum = teleNum;
        this.email = email;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
        this.birthday = birthday;
        this.birthplace = birthplace;
        this.occupation = occupation;
        this.permanentAddress = permanentAddress;
        this.currentAddress = currentAddress;
    }


    /*String username = "asiong1234";
    String password = "h@r1ngT0nd0";
    String fName = "Asiong";
    String mName = "Cruz";
    String lName = "Salonga";
    int age = 43;
    int contactNum = "09053112458";
    char gender = 'M';
    String maritalStatus = "Married";
    String birthday = "06/17/87";
    String birthplace = "Tondo, Manila";
    String occupation = "Policeman";
    String permanentAddress = "143 Kathniel St., Brgy. Hiwalayan, Tondo, Manila";
    String currentAddress = "123 Broken St., Brgy Inuman, Tanauan, Batangas";*/
}
