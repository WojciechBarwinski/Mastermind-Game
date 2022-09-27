import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class UserReader {

    private static final Scanner SCANNER = new Scanner(System.in);
    UserInputValidator userInputValidator = new UserInputValidator();


    public List<String> getInputFromUser() {
        System.out.println("Proszę wprowadzić swoją odpowiedz (konieczne 4 znaki!): ");
        String userInput = getInput();
        return Arrays.asList(userInput.toUpperCase().split(""));
    }


    private String getInput() {
        String userInput = "";
        while (userInput.isEmpty()) {
            String tmp = SCANNER.next();
            if (userInputValidator.checkInput(tmp))
                userInput = tmp;
            else {
                System.out.println(userInputValidator.getErrorMassage().toString());
            }
        }
        return userInput;
    }
}
