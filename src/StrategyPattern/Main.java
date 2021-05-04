package StrategyPattern;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
import java.util.spi.AbstractResourceBundleProvider;

public class Main {
    public static void main(String[] args) {
        Context context = new Context(new Loan("Dulat", 26301, 1000000, 30));
        Context context1 = new Context(new PurchaseByCard(5555555, 155, "qwerty", 500000));
        Context context2 = new Context(new PayPal("Dulat", "Dutay123", "qwerty", 600000));
        System.out.println("Hello :)");
        System.out.println("Here is our servives!!!");
        System.out.println("To take a loan -> 1");
        System.out.println("Purchases");
        System.out.println("Purchase by card - > 2");
        System.out.println("Purchase by PayPal -> 3");
        System.out.println("Exit -> 4");
        Scanner d = new Scanner(System.in);
        int a;
        Boolean b = true;
       while (b = true){
           a = d.nextInt();
           if (a == 1){
               System.out.println("Your loan is approved!");
               System.out.println(context.executeStrategy());

           }
           else if (a == 2){
               System.out.println("Your paid by card");
               System.out.println(context1.executeStrategy1());
           }
           else if(a == 3){
               System.out.println("You paid with PayPal");
               System.out.println(context2.executeStrategy2());
           }
           else if (a == 4){
               break;
           }
           else{
               System.out.println("Invalid value" +
                                  " Try again!!!");
           }
       }
        



    }

    }

