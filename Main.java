import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String[] command = scanner.nextLine().split("\\s+");
            switch (command[0]) {
                case "start":
                    CardGame.start(Integer.parseInt(command[1]), Integer.parseInt(command[2]));
                    break;
                case "get-cards":
                    CardGame.getCards(Integer.parseInt(command[1]));
                    break;
                default:
                    System.out.println("Ошибка: неверная команда");
            }
        }
    }
}