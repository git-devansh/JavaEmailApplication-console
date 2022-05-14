import java.util.Scanner;

public class Eamil {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private Integer mailbBoxCapacity = 300;
    private String alternativeEmail;
    private String email;
    private String companyDomain = "mycompany.com";

    public Eamil(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
//        System.out.println(this.firstName+ " " +  this.lastName);

        department = setDepartment();
//        System.out.println("Your selected department: " + department);

        password = genratePassword();
//        System.out.println("Your password is: " + password);

        email = firstName.toLowerCase() + lastName.toLowerCase() + "@" + companyDomain;
//        System.out.println("Your email is: " + email);
    }

    private String setDepartment(){
        System.out.println("All Departments");
        System.out.println("1) IT/Development");
        System.out.println("2) Marketing");
        System.out.println("3) Human Resource");
        System.out.println("4) Testing");
        System.out.println("------------------------");
        System.out.print("Enter your department number: ");
        Scanner input = new Scanner(System.in);
        int departmentNumber = input.nextInt();
        if (departmentNumber == 1) return "IT/Development";
        else if (departmentNumber == 2) return "Marketing";
        else if (departmentNumber == 3) return "Human Resource";
        else if (departmentNumber == 4) return "Testing";
        else return "--- No match ---";
    }

    private String genratePassword(){
        String allChar = "ABCDEFGHIJKLMNOPQRSTUWXYZ0123456789!@#$%^&*";
        char[] password = new char[10];
        for(int i = 0; i < 10; i++){
           int radnom = (int) (Math.random() * allChar.length());
           password[i] = allChar.charAt(radnom);
        }
        return String.valueOf(password);
    }

    // Public methods.....
    public void setMailbBoxCapacity(int capacity){
        this.mailbBoxCapacity = capacity;
    }

    public void setAlternativeEmail(String email){
        this.alternativeEmail = email;
    }

    public void changePassword(String newPassword){
        this.password = newPassword;
    }

    public int getMailboxCapacity() {
        return this.mailbBoxCapacity;
    }

    public String getAlternativeEmail() {
        return this.alternativeEmail;
    }

    public String getPassword() {
        return this.password;
    }

    public String myInfo(){
        return "Name: " + firstName + " " + lastName + "\n" +
                "Email: " + email + "\n" +
                "Mailbox Capacity: " + mailbBoxCapacity + "MB";
    }
}
