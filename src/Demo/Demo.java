package Demo;

import java.io.*;

public class Demo {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\ADMIN\\Desktop\\test.txt");
        try {
            FileWriter writer = new FileWriter(file);
            writer.write("Hello \n");
            writer.write("Bye  \n");
            writer.write("Goodnight \n");
            writer.write("123 \n");
            writer.close();
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;

            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
            bufferedReader.close();
        }catch (Exception e){
            System.err.println("File không tồn tại!");
        }
    }
}
