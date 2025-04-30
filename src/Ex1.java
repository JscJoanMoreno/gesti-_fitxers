import com.sun.security.jgss.GSSUtil;

import java.io.*;
import java.util.Scanner;

public class Ex1 {
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
            System.out.println(fileText);
        };

    }
}
