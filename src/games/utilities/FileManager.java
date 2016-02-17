/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package games.utilities;
import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.*;

/**
 *
 * @author Francis Cuccio
 */
public class FileManager {
    public static void writeToFile(String saveState, String fileName) throws IOException {
        Path file = Paths.get(fileName);
        Charset cset = Charset.forName("UTF-16");
        
        try (BufferedWriter fout = Files.newBufferedWriter(file, cset);) {
            if (saveState != null && saveState.length() > 0) {
                fout.write(saveState);
            }
            fout.flush();
        } catch (IOException ex) {
            System.err.println(ex);
        }
        System.out.println("File " + fileName + " written.");
    }
     
    public static void writeToFileAsync(final String saveState, final String fileName) {
        new Thread() {
            @Override
            public void run() {
                try {
                    writeToFile(saveState, fileName);
                } catch (IOException e) {
                }

            }
        }.start();
    }
}
