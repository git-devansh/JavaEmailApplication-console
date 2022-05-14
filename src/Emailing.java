import java.util.Scanner;

public class Emailing {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your First name: ");
        String firstname = input.nextLine();
        System.out.print("Enter your Last name: ");
        String lastname = input.nextLine();

        Eamil email = new Eamil(firstname, lastname);
        System.out.println(email.myInfo());

    }
}
