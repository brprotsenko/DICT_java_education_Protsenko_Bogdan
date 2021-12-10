import java.text.DecimalFormat;
import java.util.Objects;
import java.util.Scanner;
import java.util.*;

public class CreditCalculator {
    public static void main(String[] args) {
        calculator();
    }
    public static void calculator() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want to calculate?\n"
                + "type 'n' – for number of monthly payments,\n"
                + "type 'a' for annuity monthly payment amount,\n"
                + "type 'p' – for the monthly payment:");
        credit();
    }
    public static   void credit(){
        DecimalFormat decimalFormat = new DecimalFormat("#.#");
        Scanner scanner1 = new Scanner(System.in);
            String type = scanner1.nextLine();
            if(Objects.equals(type,"n")){
                System.out.println("Enter the loan principal:");
                double loanprincipal = scanner1.nextDouble();
                System.out.println("Enter the monthly payment:");
                double monthy_payment = scanner1.nextDouble();
                System.out.println("Enter the loan interest:");
                double loaninterest = scanner1.nextDouble();
                double i = (loaninterest/(12*100));
                double number_month = Math.log(monthy_payment/(monthy_payment-(i*loanprincipal)))/Math.log(1+i);
                System.out.println("It will take " +(int)(Math.round(number_month/12)) + " years and " +(int)(Math.round(number_month%12)) + " months to repay this loan!");

            }
            if(Objects.equals(type,"p")){
                System.out.println("Enter the annuity payment:");
                double annuitypay = scanner1.nextDouble();
                System.out.println("Enter the number of periods:");
                double n = scanner1.nextDouble();
                System.out.println("Enter the loan interest:");
                double loaninterest = scanner1.nextDouble();
                double i = (loaninterest/(12*100));
                double principal = annuitypay/((i*Math.pow((1+i),n))/(Math.pow((1+i),n)-1));
                System.out.printf("Your loan principal = %.0f",principal);

            }
            if(Objects.equals(type,"a")){
                System.out.println("Enter the loan principal:");
                double loanprincipal = scanner1.nextDouble();
                System.out.println("Enter the number of periods:");
                double n = scanner1.nextDouble();
                System.out.println("Enter the loan interest:");
                double loaninterest = scanner1.nextDouble();
                double i = (loaninterest/(12*100));
                double annualpay =  loanprincipal*((i*Math.pow((1+i),n))/(Math.pow((1+i),n)-1));
                System.out.printf("Your monthly payment = %.0f", annualpay);
            }

    }

}
