package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterDemo {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("./src/filehandling/welcome.txt");
        fw.write("Welcome to 2022");
        fw.write("\n Welcome to Codekul");
        System.out.println("Content Added");
        fw.close();
    }
}
