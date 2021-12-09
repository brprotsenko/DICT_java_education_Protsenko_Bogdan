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
        System.out.println("Enter the loan principal:");
        int principal = scanner.nextInt();
        System.out.println("What do you want to calculate?\n"
                + "type 'm' – for number of monthly payments,\n"
                + "type 'p' – for the monthly payment:");
        pay(principal);
    }
    public static   void pay(int principal){
        DecimalFormat decimalFormat = new DecimalFormat("#.#");
        Scanner scanner1 = new Scanner(System.in);
            String type = scanner1.nextLine();
            if(Objects.equals(type,"m")){
                System.out.println("Enter the monthly payment:");
                int monthly_payment = scanner1.nextInt();
                System.out.println("It will take " +principal/monthly_payment + " months to repay the loan");
            }
            if(Objects.equals(type,"p")){
                System.out.println("Enter the number of months:");
                int periods = scanner1.nextInt();
                float lastpayment = (float) (principal-((periods-1)*( Math.ceil((double)principal/periods))));
                if(principal%periods == 0){
                    System.out.println("Your monthly payment =" + principal/periods);
                }
                if(principal%periods > 0){
                    System.out.println("Your monthly payment = " + Math.ceil((double)principal/periods) + " and the last payment = "+lastpayment);
                }
            }

    }
}
