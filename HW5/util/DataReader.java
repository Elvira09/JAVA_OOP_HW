package HWJavaOOP.HW5.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DataReader {
    public String path;

    public static String fileReader(String path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        String line = br.readLine();
        while (line != null) {
            System.out.println(line);
            line = br.readLine();
        }
        br.close();
        return line;
    }

    public static String fileReaderFind(String path, String find) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        String line = br.readLine();
        while (line != null) {
            if (line.toLowerCase().contains(find.toLowerCase()))
                System.out.println(line);
            line = br.readLine();
        }
        br.close();
        return line;
    }

}
