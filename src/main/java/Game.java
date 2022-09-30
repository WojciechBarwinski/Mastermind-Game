import java.util.ArrayList;
import java.util.List;

public class Game {

    private final static int NUMBER_OF_ROUND = 9;
    private UserReader userReader;
    private Comparison comparison;
    private List<String> gameCode;
    private List<List<String>> userInputs;
    private List<List<String>> gameAnswers;

    public Game() {
        userReader = new UserReader();
        comparison = new Comparison();
        userInputs = new ArrayList<>();
        gameAnswers = new ArrayList<>();
        gameCode = CodeGenerator.getCode(true);
        System.out.println(gameCode);
    }

    public void masterMindGameStarter(){
        boolean gameFinished = false;
        int counter = 0;
        System.out.println("\nGra rozpoczęta: ");
        while (!gameFinished){

            List<String> userInput = userReader.getInputFromUser();
            userInputs.add(userInput);

            List<String> gameAnswer = comparison.comparisonCode(gameCode,userInput);
            gameAnswers.add(gameAnswer);

            showResult();

            if (userInput.equals(gameCode)){
                gameFinished = true;
                System.out.println("Wygrłeś");
            }
            counter++;
            if (counter == NUMBER_OF_ROUND){
                System.out.println("Przegrałeś");
                break;
            }
        }
    }

    private void showResult(){
        System.out.println();
        for (int i = 0; i < userInputs.size(); i++){
            System.out.println(userInputs.get(i) + " -> " + gameAnswers.get(i));
        }
        System.out.println();
    }
}
