package Experiment4.T2;

import java.util.Random;

public class Student {
    public String name;
    public String address;
    public String Major;
    public double GPA;

    public double getGPA() {
        return (new Double(GPA)).intValue();
    }

    public String getMajor() {
        return Major;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public double ComputerGPA(){
        Random r = new Random();
        double result;
        result = (r.nextInt(35)/10)+0.5;
        //result = (Math.random() * 3.5)+ 0.5;
        return result;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setMajor(String major) {
        Major = major;
    }
    public Student(String Sname, String Saddress, String SMajor){
        name = Sname;
        address =Saddress;
        Major = SMajor;
        GPA = ComputerGPA();
    }
    public Student(String Tname, String Taddress){
        name = Tname;
        address =Taddress;
        Major = "undeclared";
        GPA = ComputerGPA();
    }

    @Override
    public String toString() {
        System.out.println("StudentName: "+getName()+"\n Address: "+getAddress()+"\n Major: "+getMajor()
                +"\n GPA: "+getGPA()+"\n");
        return super.toString();
    }
}
