package Experiment4.T1;

import java.util.Scanner;

public class BandBoosterDriver {
    public static void main(String[] args){
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);

        System.out.println("Enter the name of the first booster:");
        BandBooster booster1 = new BandBooster(scan1.nextLine());

        System.out.println("Enter the name of the second booster:");
        BandBooster booster2 = new BandBooster(scan2.nextLine());

        for (int week = 1;week <= 3;week++){

            System.out.println("Enter the number of boxes sold by " + booster1.getName()
                    + " during week " + week + ":");
            scan1 = new Scanner(System.in);
            booster1.updateSales(scan1.nextInt());


            System.out.println("Enter the number of boxes sold by " + booster2.getName()
                    + " during week " + week + ":");
            scan2 = new Scanner(System.in);
            booster2.updateSales(scan2.nextInt());
        }
        System.out.println("Results after 3 weeks:");
        System.out.println(booster1);
        System.out.println(booster2);
    }
}
