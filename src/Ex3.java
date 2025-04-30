import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the file name:");
        String fileName = sc.nextLine();

        System.out.println("Enter the string to search for:");
        String searchString = sc.nextLine();

        File file = new File(fileName);

        if (!file.exists()) {
            System.out.println("The file does not exist.");
            return;
        }

        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);

        String line;
        boolean found = false;

        while ((line = br.readLine()) != null) {
            if (line.contains(searchString)) {
                found = true;
                break;
            }
        }

        br.close();

        if (found) {
            System.out.println("The string is found in the file.");
        } else {
            System.out.println("The string is NOT found in the file.");
        }
    }
}
