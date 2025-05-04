import java.io.*;

public class Ex8 {
    public static void main(String[] args) {
        String source = "source.txt";
        String target = "target.txt";

        try (
                BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(target));
        ) {
            int b;
            while ((b = bis.read()) != -1) {
                bos.write(b);
            }
            System.out.println("File copied.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
