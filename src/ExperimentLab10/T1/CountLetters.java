package ExperimentLab10.T1;

import java.util.Scanner;

public class CountLetters {
    public static void main(String[] args){
        int[] counts = new int[26];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter a single word :");
        String word = scanner.nextLine();
        word = word.toUpperCase();//translate the word to uppercase
        try{
            for (int i = 0;i < counts.length;i++){
                counts[word.charAt(i) - 'A']++;
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Not a letter");
        }finally {
            for (int i = 0; i < counts.length; i++) {
                if (counts[i] != 0 )
                    System.out.println((char)(i+'A')+": " + counts[i]);
            }
        }

    }
}
