import java.util.*;

public class CardGame {
    private static final List<String> deck = new ArrayList<>();
    private static final Map<Integer, List<String>> players = new HashMap<>();

    static void start(int numCards, int numPlayers) {
        deck.clear();
        players.clear();
        stirCards();
        if (numPlayers * numCards > deck.size()) {
            System.out.println("Ошибка: недостаточно карт в колоде");
            return;
        }

        for (int i = 1; i <= numPlayers; i++) {
            List<String> playerCards = new ArrayList<>();
            for (int j = 0; j < numCards; j++) {
                playerCards.add(deck.remove(0));
            }
            players.put(i, playerCards);
        }
    }

    static void getCards(int playerNum) {
        if (!players.containsKey(playerNum)) {
            System.out.println("Ошибка: игрок с таким номером не существует");
            return;
        }
        List<String> cards = players.get(playerNum);
        System.out.println(playerNum + " " + String.join(" ", cards));
    }

    private static void stirCards() {
        for (String color : Arrays.asList("R", "G", "B", "W")) {
            for (int value = 1; value <= 10; value++) {
                deck.add(color + value);
                Collections.shuffle(deck);
            }
        }
    }
}
