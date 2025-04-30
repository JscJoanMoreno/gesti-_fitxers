import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("set the directory");
        String dirPath = sc.nextLine();
        File dir = new File(dirPath);

        System.out.println("set the directory");
        String fileName = sc.nextLine();
        File file = new File(dir, fileName);

        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = bufferedReader.readLine();

        String fileText = "";
        while (line != null) {
            fileText += line + "/n";
            line = bufferedReader.readLine();
        }

        if (!fileText.isBlank()) {
            System.out.println(fileText.toUpperCase());
        };

    }
}
