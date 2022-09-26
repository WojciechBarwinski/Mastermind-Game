import java.util.ArrayList;
import java.util.List;

public class CodeComparison {


    // - -> zła odpowiedz
    // x -> dobra odpowiedz ale w złym miejscu
    // + -> dobra odpowiedź w dobrym miejscu

    private List<String> answer = new ArrayList<>();

    public List<String> comparisonCode(List<String> gameCode, List<String> userCode){

        for (int i = 0; i < gameCode.size(); i++){
            if (userCode.contains(gameCode.get(i))){
                if (userCode.get(i).equals(gameCode.get(i))){
                    answer.add(" + ");
                }
                else answer.add(" x ");
            }
            else answer.add(" - ");

        }
        return answer;
    }

}
