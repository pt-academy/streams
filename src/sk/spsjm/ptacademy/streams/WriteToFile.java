
package sk.spsjm.ptacademy.streams;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class WriteToFile {

    public static void main(String[] args) throws Exception {
        InputStream in = System.in;
        OutputStream out = new FileOutputStream("mojSubor.txt");

        int c = 0;
        do {
            try {
                c = in.read();
                if (c > 48) {
                    out.write(c);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } while (c != 'q');
        in.close();
        out.close();
    }
}
