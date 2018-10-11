package Experiment4.Prepare;

public class MyClass {
    private String name;
    private int ID;
    private int year;

    public MyClass(){

    }
    public MyClass(String name, int ID, int year){
        name = name;
        ID = ID;
        year = year;
    }

    public void main(String args[]){
        MyClass A = new MyClass();
        A.toString();
    }
}
