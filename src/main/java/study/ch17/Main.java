package study.ch17;
// build 구조
import study.ch16.UserEntity;

import java.util.Random;
import java.util.UUID;

public class Main {
    public static String[][] createUsernamesAndPassword() {
        String[][] usernamesAndPasswords = new String[2][60];
        String[] usernames = usernamesAndPasswords[0];
        String[] passwords = usernamesAndPasswords[1];

        for (int i = 0; i < 60; i++) {
            Random random = new Random();
            for (int j = 0; j < 10; j++) {
                int r = random.nextInt(26) + 97; // 아스키코드 소문자 a가 97
                usernames[i] += (char) r;
            }
            usernames[i] += "@gmail.com";
            passwords[i] = UUID.randomUUID().toString().replaceAll("-", "");
        }
        return usernamesAndPasswords;
    }

    public static void main(String[] args) {
        String[] usernames = Main.createUsernamesAndPassword()[0];
        String[] passwords = Main.createUsernamesAndPassword()[1];

        User[] users = new User[50];
        UserRepository userRepository = UserRepository.getInstance();
        userRepository.setUsers(users);
        UserService userService = new UserService(userRepository);
        UserController userController = new UserController(userService);
        for (int i = 0; i < 60; i++) {
            userController.postMapping(usernames[i], passwords[i]);
        }
    }
}
