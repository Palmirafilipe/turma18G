package deupau;

packege TesteErros;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class TesteErros {

    public static void main(String[] args) {
        File arquivo = new File("C:\temp\lista.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(arquivo);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException erro) {
            System.out.println("Arquivo nao encontrado");
        } finally {
            if (arquivo != null) {
                sc.close();
            }
        }

    }

}