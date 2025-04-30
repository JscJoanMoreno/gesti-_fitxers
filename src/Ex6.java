import java.io.*;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the file name:");
        String fileName = sc.nextLine();

        File file = new File(fileName);

        if (!file.exists()) {
            System.out.println("The file does not exist.");
            return;
        }

        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);

        String line;

        FileWriter fw = new FileWriter(fileName);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);
        while ((line = br.readLine()) != null) {
            pw.println(line.toUpperCase());
        }
    }
}


