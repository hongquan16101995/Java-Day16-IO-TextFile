package Optinal_BT_csv;

import java.io.*;

public class ReadFileCSV {
    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("text.txt"));
            String string;
            while ((string = bufferedReader.readLine()) != null) {
                String[] strings = string.split(",");
                System.out.println(strings[(strings.length - 1)]);
            }
        } catch (IOException ioe) {
            System.err.println(ioe.getMessage());
        }
    }
}
