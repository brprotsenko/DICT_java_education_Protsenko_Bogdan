package CoffeeMachine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args){
        System.out.println("Starting to make a coffee\n" +
                "Grinding coffee beans\n" +
                "Boiling water\n" +
                "Mixing boiled water with crushed coffee beans\n" +
                "Pouring coffee into the cup\n" +
                "Pouring some milk into the cup\n" +
                "Coffee is ready!");

        System.out.println("Write how many cups of coffee you will need:");
        Scanner scanner = new Scanner(System.in);
        int cups = scanner.nextInt();
        System.out.println("For " + cups + " cups of coffee you will need:");
        int water_for_cup = 200;
        int milk_for_cup = 50;
        int coffee_beans_for_cup = 15;
        int disposable_cup_for_cup = 1;
        System.out.println(cups * water_for_cup + " ml of water\n" +
                cups * milk_for_cup + " ml of milk\n" +
                cups * coffee_beans_for_cup + " g of coffee beans\n" +
                cups * disposable_cup_for_cup +" disposable cups");
    }
}
