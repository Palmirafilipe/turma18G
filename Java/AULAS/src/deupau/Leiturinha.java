package deupau;

import java.io.File;
import java.util.Scanner;
import java.FileNotFoundException;
public class Leiturinha {

	public static void main(String[] args) {
		
	
	File arquivo = new File("C:\\temp\lista.txt");
	Scanner sc = null;
	sc = new Scanner(arquivo);
	while (sc.hasNextLine()) {
		System.out.print(sc.nextLine());
	}
	
	
	}
catch(FileNotFoundException erro) {
System.out.println("Arquivo nao encontrado");
}
finally {
    if (arquivo != null) {
        sc.close();
    }
}
}

}
