package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MaxInteger {


    public static int[] readNumbers(String path) throws FileNotFoundException {
        int [] numbers=new int[100];
        Scanner scanner=new Scanner(new File(path));
        int i=0;//counter
        while (scanner.hasNextLine()){
            numbers[i]=Integer.parseInt(scanner.nextLine());
            System.out.println(numbers[i]);
            i++;
        }
        scanner.close();
        return numbers;
    }
    public static int findMax(int [] numbers){
        int max=numbers[0];
        for(int i=1;i<numbers.length;i++){
            if(numbers[i]>max){
                max=numbers[i];
            }

        }
        return max;

    }
    public static void writeToFile(String path, int maxNumber) throws IOException {
        File file=new File(path);
        FileWriter fw=new FileWriter(file);
        fw.write(Integer.toString(maxNumber));
        fw.close();
    }
}
