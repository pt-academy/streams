
package sk.spsjm.ptacademy.streams;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;

public class CopyFromFileToFile {

    public static void main(String[] args) throws Exception {
        FileReader inr = new FileReader("mojSubor.txt");
        OutputStream out = new FileOutputStream("mojSubor2.txt");

        int c = 0;
        do {
            try {
                c = inr.read();
                out.write(c);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } while (inr.ready());
        inr.close();
        out.close();
    }
}
