package Experiment4.T3;

import java.util.Scanner;

public class CreditCardDrive {
    public static void main(String[] args){
        CreditCards Tom = new CreditCards("Tom",295);
        Tom.toString();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0;i<6;i++){
            Tom.MakePurchase(100);//花多少
            System.out.println("Are You want Pay ? (yes/no:1/0)");
            int a = Integer.parseInt(scanner.next());
            if (a==1)
                Tom.MakePayment(101);//还多少
            else
                Tom.setRate(Tom.getRate()+0.02);
            Tom.CalculateBalance();
        }
        Tom.toString();
    }
}
