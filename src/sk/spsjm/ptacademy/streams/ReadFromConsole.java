
package sk.spsjm.ptacademy.streams;

import java.io.IOException;

import java.io.InputStream;

public class ReadFromConsole {

    public static void main(String[] args) {
        InputStream in = System.in;

        int c = 0;
        do {
            try {
                c = in.read();
                if (c > 48) {
                    System.out.println("Precitany znak je: " + c);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } while (c != 'q');
    }

}
