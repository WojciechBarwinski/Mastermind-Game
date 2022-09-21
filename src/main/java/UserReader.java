import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class UserReader {

    //zrobienie tego jakos automatycznie, lista 1 litery z kazdego enuma
    private static final List<String> LITERALS = new ArrayList<>(Arrays.asList("R", "G", "B", "Y", "G", "S", "O", "W"));
    private static final Scanner SCANNER = new Scanner(System.in);


    public static void getInputFromUser() {
        System.out.println("Proszę wprowadzić swoją odpowiedz (konieczne 4 znaki!): ");
        String userInput = getInput();
        System.out.println(userInput);
    }

    private static String getInput() {
        String userInput = "";
        while (userInput.isEmpty()) {
            String tmp = SCANNER.next().toUpperCase();
            if (checkInputLength(tmp) && checkInputLetters(tmp))
                userInput = tmp;
        }
        return userInput;
    }

    private static boolean checkInputLength(String string){
        if (string.length() < 4){
            System.out.println("za mało znaków");
            return false;
        }
        else if (string.length() > 4){
            System.out.println("za dużo znaków");
            return false;
        }
        else return true;
    }

    private static boolean checkInputLetters(String input){
        List<String> incorrectLetters = new ArrayList<>();
        List<String> letterList= new ArrayList<>(Arrays.asList(input.split("")));

        for (String s : letterList) {
            if (!LITERALS.contains(s)) {
                incorrectLetters.add(s);
                System.out.println(s + " to niepoprawny znak");
            }
        }
        return incorrectLetters.isEmpty();
    }

}
