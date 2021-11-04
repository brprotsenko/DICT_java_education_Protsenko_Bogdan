package CoffeeMachine;

import java.util.ArrayList;
import java.util.Objects;
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
        Scanner scanner2 = new Scanner(System.in);
        int[] money = {550};
        int[] waterin = {400};
        int[] milkin = {540};
        int[] coffeebeansin = {120};
        int[] disposablecupsin = {9};
        for(int i = 1;i>=i-1;i++) {
            System.out.println("Write action(buy, fill, take , remaining, exit):");
            String action_ = scanner2.nextLine();
            if (Objects.equals(action_, "exit")) {
                break;
            }
            if (Objects.equals(action_, "buy")) {
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino,4 - back to main menu.");
                int coffee = scanner.nextInt();
                if (coffee == 1) {
                    if(waterin[0] < 250 || coffeebeansin[0] < 16 || disposablecupsin[0] < 1){
                        if(waterin[0] < 250){System.out.println("Sorry, not enough water!");}
                        if(coffeebeansin[0] < 16){System.out.println("Sorry, not enough coffee beans!");}
                        if(disposablecupsin[0] < 1){System.out.println("Sorry, not enough disposable cups!");}
                    }else{
                        money[0] += 4;
                        waterin[0] -= 250;
                        coffeebeansin[0] -= 16;
                        disposablecupsin[0] -= 1;
                        System.out.println("I have enough resources, making you a coffee!");}
                }
                if (coffee == 2) {
                    if( waterin[0] < 350 || milkin[0] < 75 || coffeebeansin[0] < 20 || disposablecupsin[0] < 1){
                        if(waterin[0] < 350){System.out.println("Sorry, not enough water!");}
                        if(coffeebeansin[0] < 20){System.out.println("Sorry, not enough coffee beans!");}
                        if(milkin[0] < 75){System.out.println("Sorry, not enough milks");}
                        if(disposablecupsin[0] < 1){System.out.println("Sorry, not enough disposable cups!");}
                    }else{
                        money[0] += 7;
                        waterin[0] -= 350;
                        coffeebeansin[0] -= 20;
                        milkin[0] -= 75;
                        disposablecupsin[0] -= 1;
                        System.out.println("I have enough resources, making you a coffee!");}

                }
                if (coffee == 3) {
                    if( waterin[0] < 200 || milkin[0] < 100 || coffeebeansin[0] < 12 || disposablecupsin[0] < 1){
                        if(waterin[0] < 200){System.out.println("Sorry, not enough water!");}
                        if(coffeebeansin[0] < 12){System.out.println("Sorry, not enough coffee beans!");}
                        if(milkin[0] < 100){System.out.println("Sorry, not enough milks");}
                        if(disposablecupsin[0] < 1){System.out.println("Sorry, not enough disposable cups!");}
                    }else{
                        money[0] += 6;
                        waterin[0] -= 200;
                        coffeebeansin[0] -= 12;
                        milkin[0] -= 100;
                        disposablecupsin[0] -= 1;
                        System.out.println("I have enough resources, making you a coffee!");}
                }
                if(coffee == 4){continue;}
            }
            if(Objects.equals(action_,"fill")){
                System.out.println("Write how many ml of water the coffee machine has:");
                int water_fill = scanner2.nextInt();
                System.out.println("Write how many ml of milk the coffee machine has:");
                int milk_fill = scanner2.nextInt();
                System.out.println("Write how many grams of coffee beans the coffee machine has:");
                int coffee_beans_fill = scanner2.nextInt();
                System.out.println("Write how many disposable cups the coffee machine has:");
                int disposable_cups_fill = scanner2.nextInt();
                waterin[0] += water_fill;
                milkin[0] += milk_fill;
                coffeebeansin[0] += coffee_beans_fill;
                disposablecupsin[0] += disposable_cups_fill;
                continue;
            }
            if(Objects.equals(action_,"take")) {
                System.out.println("I gave you " + money[0]);
                money[0] = 0;
                continue;
            }
            if(Objects.equals(action_,"remaining")){
                System.out.println("The coffee machine has:\n"+
                        waterin[0] +" of water\n" +
                        milkin[0] +" of milk\n" +
                        coffeebeansin[0] +" of coffee beans\n"+
                        disposablecupsin[0] +" of disposable cups\n"+
                        money[0] +" of money");
            }
        }
    }
}
