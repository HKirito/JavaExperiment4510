package Experiment5.T1;

import java.util.ArrayList;

public class sort {
	public static ArrayList<Integer> mergeSorted(ArrayList<Integer> a, ArrayList<Integer> b){
		ArrayList newArray=new ArrayList();
		int a1=0;
		int a2=0;
		while(a1<a.size()&&a2<b.size()){
			if(a.get(a1)<b.get(a2)){
				newArray.add(a.get(a1));
				a1++;
			}
			else{
				newArray.add(b.get(a2));
				a2++;
			}
		}
		if(a1!=a.size()){
			newArray.add(a.get(a1));
		}
		else{
			newArray.add(b.get(a2));
		}
		return newArray;
	}
	public static void main(String[] args){
		ArrayList a1=new ArrayList();
		ArrayList a2=new ArrayList();
		a1.add(1);
		a1.add(5);
		a1.add(10);
		System.out.print(a1);
		a2.add(1);
		a2.add(4);
		a2.add(11);
		System.out.print(a2);
		System.out.print(mergeSorted(a1,a2));
	}
}
