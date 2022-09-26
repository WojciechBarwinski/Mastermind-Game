import java.util.List;

public class MastermindGameMain {

    public static void main(String[] args) {

        UserReader userReader = new UserReader();

        List<GameColours> gameCode = CodeGenerator.getCode(true);
        List<String> userCode = userReader.getInputFromUser();

        System.out.println(gameCode);
        System.out.println(userCode);
    }

}
