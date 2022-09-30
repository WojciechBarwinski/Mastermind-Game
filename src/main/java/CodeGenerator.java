import enums.GameColours;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class CodeGenerator {

    static private final List<GameColours> GAME_COLOURS = Arrays.asList(GameColours.values());
    static private final Random RANDOM = new Random();

    public static List<String> getCode(boolean withoutRepetition){
        List<GameColours> localGameColours = new ArrayList<>(GAME_COLOURS);
        List<GameColours> code = new ArrayList<>();

        for (int i = 0; i < 4; i++ ){
            GameColours tmpColour = localGameColours.get(RANDOM.nextInt(localGameColours.size()));
            code.add(tmpColour);
            if (withoutRepetition)
                localGameColours.remove(tmpColour);
        }
        return refactorEnumColorToListOfInitialLetter(code);
    }

    private static List<String> refactorEnumColorToListOfInitialLetter(List<GameColours> coloursList){
        return coloursList.stream().map(x -> x.toString().substring(0, 1)).collect(Collectors.toList());
    }
}
