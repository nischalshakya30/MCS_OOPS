package edu.iims.mcs.oops.week9.filereaderandwriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderAndWriterDemo {

    static final String FILE_NAME = "filereaderwriter.txt";

    static void writeToFile() {
        try {
            FileWriter fileWriter = new FileWriter(FILE_NAME);
            fileWriter.write("File reader and writer demo");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void readFromFile() {
        try {
            FileReader fileReader = new FileReader(FILE_NAME);
            int i = 0;
            while ((i = fileReader.read()) != -1) {
                System.out.print((char) i);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        writeToFile();
        readFromFile();
    }
}
