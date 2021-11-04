package CoffeeMachine;

import java.util.ArrayList;
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

        System.out.println("Write how many ml of water the coffee machine has:");
        int water_in_machine = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        int milk_in_machine = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int coffee_beans_in_machine = scanner.nextInt();
        System.out.println("Write how many disposable cups the coffee machine has:");
        int disposable_cups_in_machine = scanner.nextInt();
        System.out.println("Write how many cups of coffee you need:");
        int cups2 = scanner.nextInt();
        int number1 = water_in_machine / water_for_cup;
        int number2 = milk_in_machine / milk_for_cup;
        int number3 = coffee_beans_in_machine / coffee_beans_for_cup;
        int number4 = disposable_cups_in_machine / disposable_cup_for_cup;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 1; i++) {
            if(number1>0 || number2>0 || number3>0 || number4>0){
                list.add(number1);
                list.add(number2);
                list.add(number3);
                list.add(number4);
            }
        }
        int min = list.get(0);
        int max = list.get(0);
        for (Integer i: list) {
            if(i < min) min = i; if(i > max)
                max = i;
        }
        for(int i = 1;i<=1;i++){
            if(min == cups2){
                System.out.println("Yes, I can make that amount of coffee");
            }if(min > cups2){
                System.out.println("Yes, I can make that amount of coffee (and even "+(min-cups2)+" more than that)");
            }if(min < cups2){
                System.out.println("No, I can make only "+ min +" cups of coffee");
            }
        }
    }
}
