package ExperimentLab10.Prepare;

import java.lang.reflect.Array;

public class Test {
    public static void main(String[] args){
        int[] myArray = new int[9];
        for (int i = 0; i <= myArray.length; i++) {
            System.out.println(myArray[i]);
        }//java.lang.ArrayIndexOutOfBoundsException
        //数组索引越界访问异常
    }
}
