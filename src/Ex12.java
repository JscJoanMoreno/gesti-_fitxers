import java.io.*;

public class Ex12 {
    public static void main(String[] args) {
        String file = "nums.dat";

        try {
            RandomAccessFile raf = new RandomAccessFile(file, "rw");
            int count = (int) (raf.length() / 4);
            int[] nums = new int[count];

            for (int i = 0; i < count; i++) {
                nums[i] = raf.readInt();
            }

            for (int i = 0; i < count - 1; i++) {
                for (int j = i + 1; j < count; j++) {
                    if (nums[i] > nums[j]) {
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                    }
                }
            }

            raf.seek(0);
            for (int i = 0; i < count; i++) {
                raf.writeInt(nums[i]);
            }

            raf.close();
            System.out.println("Sorted");
        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}
