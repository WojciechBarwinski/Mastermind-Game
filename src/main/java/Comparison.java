import java.util.ArrayList;
import java.util.List;

public class Comparison {
    
    // - -> zła odpowiedz
    // x -> dobra odpowiedz ale w złym miejscu
    // + -> dobra odpowiedź w dobrym miejscu

    public List<String> comparisonCode(List<String> gameCode, List<String> userCode){

        int bedColour = 0;
        int bedPlace = 0;
        int correctPlace = 0;

        for (int i = 0; i < gameCode.size(); i++){
            if (userCode.contains(gameCode.get(i))){
                if (userCode.get(i).equals(gameCode.get(i))){
                   correctPlace++;
                }
                else bedPlace++;
            }
            else bedColour++;
        }
        return createAnswerList(bedColour, bedPlace, correctPlace);
    }

    private List<String> createAnswerList(int bedColour, int bedPlace, int correctPlace){
        List<String> answer = new ArrayList<>();
        for (int i = 0; i < bedColour; i++)
            answer.add("-");
        for (int y = 0; y < bedPlace; y++)
            answer.add("x");
        for (int z = 0; z < correctPlace; z++)
            answer.add("+");

        return answer;
    }
}
