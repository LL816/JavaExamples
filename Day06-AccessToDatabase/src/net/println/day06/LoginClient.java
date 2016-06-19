package net.println.day06;


/**
 * Created by benny on 6/19/16.
 */
public class LoginClient {
    public static void main(String... args) {
        if(args.length < 2) {
            System.out.println("Illegal arguments.");
            System.exit(0);
        }

        String username = args[0];
        String passwd = args[1];
        System.out.println(username + ";" + passwd);

//        LoginController loginController = new LoginController();
        StrongLoginController strongLoginController = new StrongLoginController();
        boolean isSuccessfully = strongLoginController.login(username, passwd);
        System.out.println(isSuccessfully);
    }
}
