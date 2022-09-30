import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserInputValidator {

    private static final List<String> LITERALS = new ArrayList<>(Arrays.asList("R", "G", "B", "Y", "G", "S", "O", "W"));

    @Getter
    private List<String> errorMassage;

    public boolean checkInput(String input){
        errorMassage = new ArrayList<>();
        if (input.length() < 4) errorMassage.add("za mało znaków");
        if (input.length() > 4) errorMassage.add("za dużo znaków");
        checkLettersCorrect(input);

        return errorMassage.isEmpty();
    }

    private void checkLettersCorrect(String input){
        List<String> letterList= new ArrayList<>(Arrays.asList(input.split("")));
        List<String> incorrectLetters = new ArrayList<>();
        for (String s : letterList) {
            if (!LITERALS.contains(s.toUpperCase())) {
                incorrectLetters.add(s);
                errorMassage.add(s + " to niepoprawny znak");
            }
        }
    }
}

