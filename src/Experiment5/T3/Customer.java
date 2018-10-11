package Experiment5.T3;

import java.util.ArrayList;
import java.util.Scanner;

public class Customer {
	private static String SearchBestCustomer(ArrayList<Double> sales, ArrayList<String> customers){
		int sentinel=0;
		for(int number=1;number<sales.size();number++){
			if(sales.get(sentinel)<sales.get(number)){
				sentinel=number;
			}
		}
		return customers.get(sentinel);
	}
	public static void main(String [] args){
		double number;
		String name;
		String BestCustomer;
		System.out.print("Please Enter cost  (or Enter -1 to exit):");
		Scanner scan=new Scanner(System.in);
		ArrayList<Double> sales=new ArrayList();
		ArrayList<String> customers=new ArrayList();
		if ((number = scan.nextDouble())<=0)
			return;
		else {
			while (Inter(number) > 0) {
				sales.add(number);
				System.out.print("Please Enter the name of customer :");
				name = scan.next();
				customers.add(name);
				System.out.print("Please Enter cost :(or Enter -1 to exit)");
				number = scan.nextDouble();
			}
			System.out.print(sales);
			BestCustomer = SearchBestCustomer(sales, customers);
			System.out.print("BestCustomer：" + BestCustomer);
		}
	}
	private static int Inter(double d) {
		return (new Double(d)).intValue();
	}
}
