import java.util.ArrayList;
import java.util.List;

public class Game {

    private final static int NUMBER_OF_ROUND = 9;
    private UserReader userReader;
    private Comparison comparison;
    private List<String> gameCode;
    private List<List<String>> userInputs;
    private List<List<String>> gameAnswer;

    public Game() {
        userReader = new UserReader();
        comparison = new Comparison();
        userInputs = new ArrayList<>();
        gameAnswer = new ArrayList<>();
        gameCode = CodeGenerator.getCode(true);

        System.out.println(gameCode);
    }

    public void masterMindGameStarter(){
        boolean gameFinished = false;
        int counter = 0;

        while (!gameFinished){

            List<String> userAnswer = userReader.getInputFromUser();
            userInputs.add(userAnswer);

            List<String> answer = comparison.comparisonCode(gameCode,userAnswer);
            gameAnswer.add(answer);

            showResult();

            if (userAnswer.equals(gameCode)){
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
        for (int i = 0; i < userInputs.size(); i++){
            System.out.println(userInputs.get(i) + " -> " + gameAnswer.get(i));
        }
    }
}
