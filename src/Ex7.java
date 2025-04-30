import java.io.*;

public class Ex7 {
    public static void main(String[] args) {
        String nomOriginal = "exemple.txt";
        String nomCopia = obtenirNomCopia(nomOriginal);

        try (
                BufferedReader lector = new BufferedReader(new FileReader(nomOriginal));
                BufferedWriter escriptor = new BufferedWriter(new FileWriter(nomCopia));
        ) {
            String linia;
            while ((linia = lector.readLine()) != null) {
                escriptor.write(linia);
                escriptor.newLine();
            }
            System.out.println("Còpia creada amb èxit: " + nomCopia);
        } catch (IOException e) {
            System.out.println("Error en copiar el fitxer: " + e.getMessage());
        }
    }

    public static String obtenirNomCopia(String nomOriginal) {
        int punt = nomOriginal.lastIndexOf(".");
        if (punt == -1) {
            return nomOriginal + "2";
        } else {
            return nomOriginal.substring(0, punt) + "2" + nomOriginal.substring(punt);
        }
    }
}
