package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Reading numbers...");
        int[] numbers=MaxInteger.readNumbers("/Users/Korisnik/Desktop/numbers.txt");
        int maxNumber=MaxInteger.findMax(numbers);
        System.out.println("Max number is: "+maxNumber);
        System.out.println("Writing to file...");
        MaxInteger.writeToFile("/Users/Korisnik/Desktop/maxnumber.txt",maxNumber);

    }

}