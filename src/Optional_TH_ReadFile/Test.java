package Optional_TH_ReadFile;

import java.io.File;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("Nhập đường dẫn file: ");
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        File file = new File(path);

        ReadFileExample readFileExample = new ReadFileExample();
        readFileExample.readFileText(file.getAbsolutePath());
    }
}
