package Experiment5.Prepare;

import java.util.ArrayList;

public class Test1 {

    public static void append(ArrayList<String> target,ArrayList<String> source){
        for (int i = 0; i < source.size(); i++) {
            target.add(source.get(i));
        }
    }
    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<String>();
        names.add("Bob");
        names.add(0,"Ann");
        names.remove(1);
        names.add("Cal");
        System.out.println(names);//[Ann,Cal]

        ArrayList<String> names1 = new ArrayList<String>();
        names1.add("Emily");
        names1.add("Cindy");
        ArrayList<String> names2 = new ArrayList<String>();
        names2.add("Dave");
        append(names1,names2);
        System.out.println(names1);//[Emily, Cindy, Dave]
        System.out.println(names2);//[Dave]
    }

}
