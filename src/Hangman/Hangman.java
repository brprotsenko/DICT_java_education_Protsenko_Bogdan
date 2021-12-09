package Hangman;

import java.util.*;

public class Hangman {
    public void play(){
        menu();
    }
    public void menu(){
        Scanner scanner = new Scanner(System.in);
        for(int i = 1; i>i-1;i++){
            System.out.println("HANGMAN");
            System.out.print("Type play to play the game,exit to quit:> ");
            String answer = scanner.nextLine();
            if(Objects.equals(answer,"play")){
                words();
            }else {
                break;
            }
        }
    }
    public void words() {
        Random random = new Random();
        List<String> Words = new ArrayList<String>();
        Words.add("java");
        Words.add("python");
        Words.add("javascript");
        Words.add("kotlin");
        String rndWords = Words.get(random.nextInt(Words.size()));
        Set<String> word = new HashSet<>();
        List<String> letters = new ArrayList<>();
        for (int j = 0; j < rndWords.length(); j++) {
            word.add(String.valueOf(rndWords.charAt(j)));
        }
        check(word,rndWords,letters);
    }
}
