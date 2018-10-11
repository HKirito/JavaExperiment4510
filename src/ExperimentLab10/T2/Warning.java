package ExperimentLab10.T2;

import java.io.*;
import java.util.Scanner;

public class Warning {

    public static void main(String[] args){

        int creditHrs;
        double qualityPts;
        double GPA;

        String line, name;
        String inputName = "E:\\idea workspace\\Java Experiment 4-5\\Source\\students.dat";
        String outputName = "E:\\idea workspace\\Java Experiment 4-5\\Source\\Warning.dat";

        try {
            File file = new File(inputName);
            Scanner scanner = new Scanner(file);

            while(scanner.hasNextLine()){
                line = scanner.nextLine();

                try{
                    String[] lines = line.split("\\s");
                    name = lines[0];
                    creditHrs = Integer.parseInt(lines[1]);
                    if(lines.length==4){
                        qualityPts = Double.parseDouble(lines[3]);
                        //System.out.println(lines[0]+" "+lines[1]+" "+lines[2]+" "+lines[3]);
                    }
                    else{
                        qualityPts = Double.parseDouble(lines[2]);
                        //System.out.println(lines[0]+" "+lines[1]+" "+lines[2]);
                    }
                    GPA = qualityPts/creditHrs;

                    if (GPA<1.5||creditHrs<30||(GPA==1.75 && creditHrs<60)){
                        try{
                            PrintWriter printWriter = new PrintWriter(new FileWriter(outputName,true));
                            printWriter.print(name+" ");
                            printWriter.print(creditHrs+" ");
                            printWriter.print(qualityPts+" ");
                            printWriter.println(GPA);

                            printWriter.close();
                        }catch (IOException e){
                            e.printStackTrace();
                        }
                    }
                }catch (NumberFormatException e){
                    e.printStackTrace();
                }
            }

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }

    }

}
