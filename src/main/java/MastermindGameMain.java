import java.util.List;

public class MastermindGameMain {

    public static void main(String[] args) {

        UserReader userReader = new UserReader();
        Comparison comparison = new Comparison();

        List<String> gameCode = CodeGenerator.getCode(true);
        System.out.println(gameCode);

        List<String> userCode = userReader.getInputFromUser();
        System.out.println(userCode);

        List<String> answer = comparison.comparisonCode(gameCode, userCode);
        System.out.println(answer);

    }

}
