package Experiment5.T2;

import java.util.Scanner;

public class pet {
	public static void discount(double[] prices, boolean[] isPet, int nItems){
		double petPay=0.0;
		double pay=0.0;
		int number=0;
		for(int i=0;i<nItems;i++){
			if(isPet[i]){
				petPay+=prices[i];
			}
			else{
				pay+=prices[i];
				number++;
			}
		}
		if(petPay>0&&number>=5){
			System.out.println("The Price before discount :"+(pay+petPay));
			pay=pay*0.8;
		}
		pay+=petPay;
		System.out.println("The finally Price :"+pay);
		
	}
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		double[] prices = new double[100];
		boolean[] isPet = new boolean[100];
		int count=0;
		int nitem=0;
		String ispet;
		double number;
		System.out.print("Please input price : ");
		while(Integer(number=scan.nextDouble())>0){
			prices[count]=number;
			nitem++;
			System.out.print("Please input name: ");
			ispet=scan.next();
			if(ispet.equals("Y")||ispet.equals("y")){
				isPet[count]=true;
			}
			else{
				isPet[count]=false;
			}
			count++;
			System.out.print("Please input next price : ");
		}
		discount(prices,isPet,nitem);	
	}
	private static int Integer(double d) {
		// TODO Auto-generated method stub
		return (new Double(d)).intValue();
	}

}
