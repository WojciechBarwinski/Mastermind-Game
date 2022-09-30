import java.util.List;

public class MastermindGameMain {

    public static void main(String[] args) {

        System.out.println("\n Witaj w grze mastermind. Twoim zadaniem jest odgadnienie kodu. Kod jest złożony z 4 kolorów z puli: \n");
        System.out.println("RED, GREEN, BLUE, YELLOW, GOLD, SILVER, ORANGE, WHITE   które w grze reprezentowane są przez 1 litery RED -> R, Gold -> G itd.\n");
        System.out.println("Swoją odpowiedz podajesz używając tylko 1 liter. Przykładowa odpowiedz którą można wprowadzić:  rgbw\n");
        System.out.println("W odpowiedzi uzyskasz wynik składający się z: \n - > jeden z podanych kolorów w kodzie w ogóle nie występuje \n x -> oznacza ze jeden z kolorów jest w zgadywanym kodzie ale na złym miejscu \n + -> jeden z kolorów jest juz na właściwym miejscu\n");
        System.out.println("Na przykład odpowiedz [-, -, x, +] oznacza że: \n 2 podanych kolorów w kodzie nie ma w ogóle \n 1 z kolorów jest w kodzie ale nie na swoim miejscu \n 1 kolor jest juz na swoim miejscu");
        System.out.println("Powodzenia!");
        Game game = new Game();
        game.masterMindGameStarter();

    }

}
