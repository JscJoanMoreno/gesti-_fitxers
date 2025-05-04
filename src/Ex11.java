import java.io.*;

public class Ex11 {
    public static void main(String[] args) {
        String file = "nums.dat";
        int sum = 0;
        int count = 0;

        try {
            DataInputStream in = new DataInputStream(new FileInputStream(file));
            while (in.available() > 0) {
                int n = in.readInt();
                sum += n;
                count++;
            }
            in.close();

            double avg = (double) sum / count;

            DataOutputStream out = new DataOutputStream(new FileOutputStream(file, true));
            out.writeDouble(avg);
            out.close();

            System.out.println("Average: " + avg);
        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}
