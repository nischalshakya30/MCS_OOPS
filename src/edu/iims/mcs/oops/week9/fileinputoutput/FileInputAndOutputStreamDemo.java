package edu.iims.mcs.oops.week9.fileinputoutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileInputAndOutputStreamDemo {

    static void writeAsciiToFile() {
        try {
            FileOutputStream fos = new FileOutputStream("out.txt");
            fos.write(65);
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void readAsciiFromFile() {
        try {
            FileInputStream fis = new FileInputStream("out.txt");
            int i = fis.read();
            System.out.println((char) i);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void writeCharacterToFile() {
        try {
            FileOutputStream fos = new FileOutputStream("string.txt");
            String s = "Hello world";
            fos.write(s.getBytes(StandardCharsets.UTF_8));
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void readCharacterFromFile() {
        try {
            FileInputStream fis = new FileInputStream("string.txt");
            int i = 0;
            while ((i = fis.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        writeAsciiToFile();
        readAsciiFromFile();

        writeCharacterToFile();
        readCharacterFromFile();
    }

}
