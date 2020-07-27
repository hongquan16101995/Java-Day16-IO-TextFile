package Demo;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo2 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};

        try {
            FileOutputStream out = new FileOutputStream(String.valueOf(a[0]));
            DataOutputStream data = new DataOutputStream(out);

            for (int i = 0; i < a.length; i++)
                data.writeInt(a[i]);
            data.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
