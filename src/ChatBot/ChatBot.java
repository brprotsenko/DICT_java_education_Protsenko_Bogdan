package ChatBot;
import java.util.Scanner;

public class ChatBot {
    public  static void main(String[] args) {
        System.out.println("Hello! My name is BOT " +
                "\nI was created in 2021");
        System.out.println("Please, remind me your name.");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");
    }
}
