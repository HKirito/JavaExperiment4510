package Experiment5.T4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Customer2 {
	private static ArrayList<String> nameOfBestCustomers(ArrayList<Double> sales, ArrayList<String> customers, int top){

		if(top>=customers.size()){
			return customers;
		}

		Double[] d=new Double[sales.size()];
		ArrayList newArray=new ArrayList();
		for(int i=0;i<sales.size();i++){
			d[i]=sales.get(i);
		}

		Arrays.sort(d);
		double number=d[sales.size()-top];
		System.out.print("花费超过"+number+"有");

		for(int i =0;i<sales.size();i++){
			if(sales.get(i)>=number){
				newArray.add(customers.get(i));
			}
		}
	return newArray;
	}
	public static void main(String [] args){
		Scanner scan=new Scanner(System.in);
		ArrayList<Double> sales=new ArrayList();
		ArrayList<String> customers=new ArrayList();
		ArrayList frist=new ArrayList();
		double number;
		String name;
		String BestCustomer;
		while(Inter(number=scan.nextDouble())>0){
			sales.add(number);
			name=scan.next();
			customers.add(name);
		}
		System.out.print(sales);
		frist=nameOfBestCustomers(sales,customers,3);
		for(int i =0;i<frist.size();i++){
			System.out.print(frist.get(i)+"\n");
		}
	}
	private static int Inter(double d) {
		return (new Double(d)).intValue();
	}
}
