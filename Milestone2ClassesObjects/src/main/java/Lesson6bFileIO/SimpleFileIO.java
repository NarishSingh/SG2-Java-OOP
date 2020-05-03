package Lesson6bFileIO;

import java.io.*;
/*
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
 */
import java.util.Scanner;

public class SimpleFileIO {

    public static void main(String[] args) throws IOException {
        //Marshaling
        //PrintWriter obj to write to files
        //FileWriter creates the file but needs to throw IOException see line 10
        PrintWriter out = new PrintWriter(new FileWriter("OutFile.txt"));

        //write with println
        out.println("This is a line in my file");
        out.println("A second line");
        out.println("A third now");
        out.flush(); //forces everything to be written to file
        out.close(); //closes io stream

        //unmarshalling
        //need a Scanner with BufferedReader, which uses FileReader obj
        Scanner read = new Scanner(new BufferedReader(new FileReader("OutFile.txt")));

        while (read.hasNextLine()) {
            String currentLine = read.nextLine();
            System.out.println(currentLine);
        }
    }

}
