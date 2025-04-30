import java.io.*;
import java.util.Scanner;

public class Ex5 {
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

        String line = "";
        boolean found = false;
        int counter = 0;

        while ((line = br.readLine()) != null) {
            if (line.contains(searchString)) {
                found = true;
                counter++;
                break;
            }
        }
        if (found) {
        FileWriter fw = new FileWriter(fileName, true);
        BufferedWriter bw = new BufferedWriter(fw);
        String writerLine = counter + "";
        bw.write(writerLine);
        }else System.out.println("No such the string");
        br.close();

    }
}


