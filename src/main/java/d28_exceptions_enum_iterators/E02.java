package d28_exceptions_enum_iterators;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E02 {
    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("src/main/java/d27_exceptions/file.txt");
            int k = 0; // Okunan değerleri buraya yükleyeceğiz

            while ((k = fis.read()) != -1){
                System.out.print((char) k); // Type Casting // Java kolaydir
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
