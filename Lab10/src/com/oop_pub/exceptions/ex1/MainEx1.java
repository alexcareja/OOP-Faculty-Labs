package com.oop_pub.exceptions.ex1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainEx1 {
    private static void readAndPrintLine(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // TODO: Read a line from stdin and print it to stdout
        try {
            String a = reader.readLine();
            System.out.println(a);
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        // TODO: Don't forget to close the reader (Hint: try-with-resources, try-finally)

    }

    public static void main(String[] args) {
        readAndPrintLine();
    }
}
