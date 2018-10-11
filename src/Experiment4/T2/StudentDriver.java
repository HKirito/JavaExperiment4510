package Experiment4.T2;

import java.util.Scanner;

public class StudentDriver {
    public static void main(String[] args){


        Student student1 = new Student("Alice","Haven","Math");
        System.out.println(student1.getName());
        student1.toString();

        Student student2 = new Student("Tom","Die","English");
        System.out.println(student2.getName());
        student2.toString();
    }
}
