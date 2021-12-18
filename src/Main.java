import java.net.Socket;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Outer :while (true) {
            System.out.println("""
                1.sign up
                2.log in
                3.show chefs
                0.exit""");
            switch (scanner.nextInt()) {
                case 1:
                    int age = 0;
                    String firstName = "";
                    String lastName = "";
                    while(!Chef.isOfAge(age)) {
                        System.out.println("please enter your first name");
                        firstName = scanner.next();
                        System.out.println("please enter your last name");
                        lastName = scanner.next();
                        System.out.println("please enter your age");
                        age = scanner.nextInt();
                    }
                    System.out.println("please enter your username");
                    String username = scanner.next();
                    System.out.println("please enter your password");
                    String password = scanner.next();
                    System.out.println("""
                            1.master chef
                            2.second class chef
                            3.assistant chef""");
                    switch (scanner.nextInt()) {
                        case 1 -> new MasterChef(firstName, lastName, age, username, password);
                        case 2 -> new SecondClassChef(firstName, lastName, age, username, password);
                        case 3 -> new AssistantChef(firstName, lastName, age, username, password);
                    }
                    System.out.println("Sign up successful. Enter any key to go back");
                    scanner.next();
                    break;

                case 2:
                    username = "";
                    password = "";
                    //TODO : can be refactored
                    while (!Chef.attemptLogin(username,password)) {
                        System.out.println("please enter your username");
                        username = scanner.next();
                        System.out.println("please enter your password");
                        password = scanner.next();
                    }
                    Chef chef = StaticClass.findChefByUsername(username);
                    System.out.println(chef.toString());

                    System.out.println("Log in successful. Enter any key to go back");
                    scanner.next();
                    break;

                case 3:
                    System.out.println("show chefs");
                    break;
                case 0:
                    break Outer;
            }
        }
    }


    //TODO : errors are not handled.
}
