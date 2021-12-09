package Hangman;

import java.util.Objects;
import java.util.Scanner;

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
}
