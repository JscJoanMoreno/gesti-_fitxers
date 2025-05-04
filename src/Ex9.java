import java.io.*;

public class Ex9 {
    public static void main(String[] args) {
        String input = "original.dat";
        String output = "copy.dat";

        try {
            BufferedInputStream in = new BufferedInputStream(new FileInputStream(input));
            BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(output));

            int b;
            while ((b = in.read()) != -1) {
                out.write(b);
            }

            in.close();
            out.close();
            System.out.println("File copied.");
        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}